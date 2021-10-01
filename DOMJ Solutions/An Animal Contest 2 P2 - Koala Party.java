import java.util.*;
import java.io.*;
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] a = new long[n];
        Set<Long> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            a[i] = readLong();
            set.add(a[i]);
        }

        if(n == 2) {
            if((a[0] + a[1]) % 2 == 0) {
                System.out.println(2);
                return;
            }
            System.out.println(1);
        }
        else {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i != j && set.contains(a[j] * 2 - a[i])) {
                        System.out.println(3);
                        return;
                    }
                }
            }
            System.out.println(2);
        }
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

    static long gcd(long m, long n) {
        return n == 0 ? m : gcd(n, m%n);
    }
}
