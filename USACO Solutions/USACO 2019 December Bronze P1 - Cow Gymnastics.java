import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

    static int a[][];

	public static void main(String[] args) throws IOException{
        int k = readInt(), n = readInt();
        a = new int[k][n];

        for(int i = 0; i < k; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = readInt();

        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int cnt = 0;
                for(int s = 0; s < k; s++) {
                    if(comp(i, j, s)) cnt++;
                }

                if(cnt == k) ans++;
            }
        }
        System.out.println(ans);
    }

    static boolean comp(int c1, int c2, int s) {
        int c1P = 0, c2P = 0;
        for(int i = 0; i < a[0].length; i++) {
            if(a[s][i] == c1) c1P = i;
            if(a[s][i] == c2) c2P = i;
        }
        return c1P > c2P;
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
