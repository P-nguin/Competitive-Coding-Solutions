import java.util.*;
import java.io.*;
public class zhao {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int n = readInt();
        long d = readLong();
        int k = readInt();
        double x = (100 - readDouble())/100;
        long[] s = new long[n];
        for(int i = 0; i < n; i++) {
            s[i] = readLong();
        }

        long p = readLong();
        for(int i = 0; i < n; i++) {
            while(s[i] >= p && k > 0) {
                Math.floor(s[i] *= x);
                k--;
            }

            if(p <= s[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
