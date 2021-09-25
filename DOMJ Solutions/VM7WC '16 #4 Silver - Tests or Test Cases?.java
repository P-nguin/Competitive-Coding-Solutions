import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

    
    static Map<String, Boolean> map = new HashMap<>();
    static ArrayList<String[]> order = new ArrayList<>();
    static int maxL;
    static int N;
	public static void main(String[] args) throws IOException{
        N = readInt();
        maxL = readInt();
        for(int i = 0; i < N; i++) {
            int hi = readInt();
            String[] in = new String[hi];
            for(int j = 0; j < hi; j++) {
                in[j] = next();
            }
            order.add(in);
        }

        for(String s:order.get(0)) {
            System.out.println(s);
            f(1,s);
        }
    }

    static String f(int stage, String out) {
        if(stage >= N || out.length() >= maxL) {
            return " ";
        }
        else {
            for(int i = stage; i < N; i++) {
                for(String s:order.get(i)) {
                    String c = out + s;
                    System.out.println(c);
                    f(i+1, c);  
                }
            }
        }
        return "";
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
