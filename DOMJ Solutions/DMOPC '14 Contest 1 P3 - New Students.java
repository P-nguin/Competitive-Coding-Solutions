import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int amount = readInt();
        double total = 0;
        for(int i = 0; i < amount; i++) {
            total += readInt();
        }

        int s = readInt();
        for(int i = 0; i < s; i++) {
            int num = readInt();
            amount++;
            total += num;

            System.out.println(total/amount);
        }
    }

    static boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num % 2 == 0 && num != 2) return false;
        for(int i = 3; i < Math.sqrt(num) + 1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
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
