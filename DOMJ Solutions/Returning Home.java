import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), s = readInt(), ans = 0;
        List<String> str = new LinkedList<>();
        boolean[][] b = new boolean[s][s];

        for(int i = 0; i < n; i++) {
            str.add(readLine());
        }

        for(int i = 0; i < m; i++) {
            b[readInt()-1][readInt()-1] = true;
        }

        for(String x:str) {
            boolean p = true;
            for(int i = 0; i < s && p; i++) {
                for(int j = i; j < s && p; j++) {
                    if(!b[i][j]) continue;

                    for(int p1 = i, p2 = j; p1 < p2 && p; p1++, p2--) {
                        if(x.charAt(p1) != x.charAt(p2)) p = false;
                    }
                }
            }
            if(p) ans++;
        }
        System.out.println(ans);
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
