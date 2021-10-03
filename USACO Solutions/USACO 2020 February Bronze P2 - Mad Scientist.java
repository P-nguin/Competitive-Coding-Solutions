import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt(); String a = readLine(), b = readLine();
        boolean flip = false;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            char cur = b.charAt(i);
            if(flip) {
                if(cur == 'G') cur = 'H';
                else cur = 'G';
            }

            if(cur != a.charAt(i)) {
                if(flip) {
                    flip = false;
                }
                else {
                    flip = true;
                    ans++;
                }
            }
        }
        System.out.println(ans);
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
}
