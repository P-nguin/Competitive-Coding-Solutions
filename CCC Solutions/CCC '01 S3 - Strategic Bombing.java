import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] roads = new boolean[26][26];

        String in = "";
        List<String> go = new LinkedList<String>();
        while(true) {
            in = sc.nextLine();

            if(in.equals("**")) {
                break;
            }
            go.add(in);
        }

        int count = 0;
        for(String s:go) {
            roads = reset(go);
            int row = s.charAt(0) - 65;
            int col = s.charAt(1) - 65;
            roads[row][col] = false;
            roads[col][row] = false;

            
            for(int k = 0; k < 26; k++) {
                for(int i = 0; i < 26; i++) {
                    if(roads[i][k]) {
                        for(int j = 0; j < 26; j++) {
                            if(roads[i][k] && roads[k][j]) {
                                roads[i][j] = true;
                            }
                        }
                    }
                }
            }

            if(!roads[0][1]) {
                System.out.println(s);
                count++;
            }
        }        
        System.out.println("There are " + count + " disconnecting roads.");
    }

    static boolean[][] reset(List<String> l) {
        boolean[][] r = new boolean[26][26];
        for(String s:l) {
            int row = s.charAt(0) - 65;
            int col = s.charAt(1) - 65;
            r[row][col] = true;
            r[col][row] = true;
        }

        return r;
    }
}
