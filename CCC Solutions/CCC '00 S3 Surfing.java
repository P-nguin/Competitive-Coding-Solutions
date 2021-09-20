import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        Page[] pages = new Page[num];
        for (int i = 0; i < num; i++) {
            pages[i] = new Page(sc.nextLine(), i);

            String in = sc.nextLine();
            while (!in.equals("</HTML>")) {
                pages[i].lines.add(in);
                in = sc.nextLine();
            }
        }

        for (Page p : pages) {
            List<String> urls = p.getLinks(false);
            for (String s : urls) {
                System.out.println("Link from " + p.url + " to " + s);
            }
        }

        while (true) {
            String homez = sc.nextLine();
            if (homez.equals("The End")) {
                break;
            }
            String findz = sc.nextLine();

            int home = 0;
            for(Page p:pages) {
                if(p.url.equals(homez)) 
                    home = p.num;
            }

            Queue<Integer> q = new LinkedList<Integer>();
            Map<Integer, Boolean> linksUsed = new HashMap<Integer, Boolean>();
            linksUsed.put(home, true);
            q.add(home);
            boolean found = false;

            while(q.size() != 0) {
                int h = q.poll();
                List<String> hi = pages[h].getLinks(true);
                if(hi.contains(findz)) {
                    System.out.println("Can surf from " + homez + " to " + findz + ".");
                    found = true;
                    break;
                }
                else {
                    for(String s:hi) {
                        for(Page p:pages) {
                            if(p.url.equals(s) && !linksUsed.containsKey(p.num)) {
                                q.add(p.num);
                                linksUsed.put(p.num, true);
                            }
                        }
                    }
                }
            }
            if(!found) System.out.println("Can't surf from " + homez + " to " + findz + ".");
        }
    }

    static boolean[][] reset(Page[] pages, List<int[]> connect) {
        boolean[][] grid = new boolean[pages.length][pages.length];

        for (int[] j : connect) {
            grid[j[0]][j[1]] = true;
        }

        return grid;
    }

    static class Page {
        int num;
        String url;
        List<String> lines = new LinkedList<String>();
        List<String> links = new LinkedList<String>();

        public Page(String urlz, int numz) {
            url = urlz;
            num = numz;
        }

        public List<String> getLinks(boolean found) {
            if (found)
                return links;

            for (String s : lines) {
                while (s.contains("<A HREF=")) {
                    int in = s.indexOf("<A HREF=");
                    links.add(s.substring(in + 9, s.indexOf("\">", in)));
                    s = s.substring(in + 10);
                }
            }
            return links;
        }
    }
}
