import java.util.*;
import java.io.*;
public class zhao {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static int n, ans;
    static boolean[][] a;
	public static void main(String[] args) throws IOException {
        n = readInt(); int m = readInt(); a = new boolean[n+1][n+1];
        for(int i = 0; i < m; i++) {
            int r1 = readInt(); int r2 = readInt();
            a[r1][r2] = a[r2][r1] = true;
        }
        List<Integer> combo = new ArrayList<>();
        f(1,combo);
        System.out.println(ans);
	}

    static void f(int id, List<Integer> ar) {
        if(id > n) {
            ans++;
            return;
        }

        f(id+1, ar);
        boolean flag = true;
        for(int i:ar) {
            if(a[i][id]) {
                flag = false;
                break;
            }
        }

        if(flag) {
            ar.add(id);
            f(id+1,ar);
            ar.remove(ar.size()-1);
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
}
