import java.util.*;
import java.io.*;
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

    static List<Integer> a = new ArrayList<>();
    static int ans, h, s;
	public static void main(String[] args) throws IOException {
        h = readInt();
        s = readInt();
        ans = Integer.MAX_VALUE;
        int total = 0;
        for(int i = 0; i < s; i++) {
            int n = readInt();
            a.add(n);
            total += n;
        }

        if(total < h || s == 0) {
            System.out.println(0);
            return;
        }

        Collections.sort(a);
        for(int i = 0; i < s; i++) {
            find(0, i, 0);
        }
        System.out.println(ans==Integer.MAX_VALUE? 0:ans);
    }

    static void find(int amount,int id, int cnt) {
        if(amount == h) {
            ans = Math.min(ans, cnt);
            return;
        }
        if(id >= s) {
            return;
        }

        find(amount, id+1 , cnt+1);
        find(amount + a.get(id), id+1, cnt+1);
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
