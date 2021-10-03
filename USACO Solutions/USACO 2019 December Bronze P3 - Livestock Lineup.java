import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

    static String[] cow;
    static List<List<String>> all;

	public static void main(String[] args) throws IOException{
        cow = new String[] {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
        all = new ArrayList<>();
        Arrays.sort(cow);

        List<String> ok = new ArrayList<>();
        for(String s : cow) ok.add(s);

        int n = readInt();
        String[][] a = new String[n][2];
        for(int i = 0; i < n; i++) {
            String[] k = readLine().split(" ");
            a[i][0] = k[0]; a[i][1] = k[5];
        }

        f(new ArrayList<>(), ok);

        for(List<String> list : all) {
            boolean flag = true;
            for(int i = 0; i < n; i++) {
                
                int pos1 = 0, pos2 = 0;
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).equals(a[i][0])) pos1 = j;
                    if(list.get(j).equals(a[i][1])) pos2 = j;
                }
                
                if(Math.abs(pos1 - pos2) != 1) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                for(String s : list)
                    System.out.println(s);
                return;
            }
        }        
    }

    static void f(List<String> cur, List<String> add) {
        if(add.isEmpty()) {
            ArrayList<String> c = new ArrayList<>();
            for(String s : cur) c.add(s);
            all.add(c);
            return;
        }

        for(int i = 0; i < add.size(); i++) {
            cur.add(add.get(i));
            add.remove(i);
            f(cur, add);

            add.add(i, cur.get(cur.size()-1));
            cur.remove(cur.size()-1);
        }
    }

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
    static long quickPow(int x, int n, int mod) {
        if(n == 0) return 1;
        long t = quickPow(x, n/2, mod);
        if(n % 2 == 0) return t*t%mod;
        return t*t%mod*x%mod;
    }
    static int gcd(int n, int m) {
        if(m == 0) return n;
        return gcd(m, n % m);
    }
}
