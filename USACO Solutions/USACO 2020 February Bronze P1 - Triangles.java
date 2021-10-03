import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int nums = readInt();

        int[][] post = new int[nums][2];
        for(int i = 0; i < nums; i++) {
            post[i][0] = readInt();
            post[i][1] = readInt();
        }

        int ans = 0;
        for(int i = 0; i < nums; i++) {
            for(int j = i+1; j < nums; j++) {

                if(post[i][0] == post[j][0]) {
                    int base = Math.abs(post[i][1] - post[j][1]);

                    for(int k = 0; k < nums; k++) {
                        if(k != i && k != j && (post[i][1] == post[k][1] || post[j][1] == post[k][1])) {
                            ans = Math.max(ans, Math.abs(post[k][0] - post[i][0]) * base);
                        }
                    }
                }
                else if(post[i][1] == post[j][1]) {
                    int base = Math.abs(post[i][0] - post[j][0]);

                    for(int k = 0; k < nums; k++) {
                        if(k != i && k != j && (post[i][0] == post[k][0] || post[j][0] == post[k][0])) {
                            ans = Math.max(ans, Math.abs(post[k][1] - post[i][1]) * base);
                        }
                    }
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
