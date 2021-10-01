import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException{
        int n = readInt();
        String s = readLine();
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }

        int odd = 0;
        for(int i = 0; i < 26; i++) {
            if(a[i] %2 == 1) odd++;
        }
        System.out.println(Math.max(1, odd));
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
    static long gcd(long m, long n) {
        return n == 0 ? m : gcd(n, m%n);
    }
}
