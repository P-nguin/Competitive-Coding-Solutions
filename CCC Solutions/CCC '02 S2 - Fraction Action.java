import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int n = readInt(), d = readInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }

        int whole = (int)n/d;
        n %= d;
        if(n == 0) {
            System.out.println(whole);
            return;
        }

        int g = gcd(n, d);
        if(whole != 0)
            System.out.println(whole + " " + (n/g) + "/" + (d/g));
        else
            System.out.println((n/g) + "/" + (d/g));
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
    static boolean prime(int n) {
        if(n < 2 || n != 2 && n % 2 == 0) return false;

        return true;
    }
}
