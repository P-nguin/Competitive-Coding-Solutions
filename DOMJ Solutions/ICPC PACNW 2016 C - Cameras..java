import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int n = readInt(), k = readInt(), r = readInt();
        int[] a = new int[n+1];
        for(int i = 0; i < k; i++) {
            a[readInt()]++;
        }

        int am = 0;
        int ans = 0;
        for(int i = 1; i <= r; i++) {
            am += a[i];
        }
        for(int i = 1; i <= n-r+1; i++) {
            if(a[i+r-1] == 1 && i != 1) am++;

            int cnt = i+r-1;
            while(am < 2) {
                if(a[cnt] == 0) {
                    am++;
                    a[cnt]++;
                    ans++;
                }
                cnt--;
            }

            if(a[i] == 1) am--;
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
    static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m%n);
    }
}
