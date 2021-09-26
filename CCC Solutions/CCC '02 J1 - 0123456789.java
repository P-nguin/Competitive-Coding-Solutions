import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        String lol = readLine();
        if(lol.equals("1")) {
        System.out.println();
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println();
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println();   
        }
        else if(lol.equals("2")) {
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println(" * * *");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println(" * * *");
        }
        else if(lol.equals("3")) {
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println(" * * *");
        }
        else if(lol.equals("4")) {
        System.out.println();
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println();
        }
        else if(lol.equals("5")) {
        System.out.println(" * * *");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println(" * * *");
        }
        else if(lol.equals("6")) {
        System.out.println(" * * *");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println(" * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        }
        else if(lol.equals("7")) {
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println();
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println();
        }
        else if(lol.equals("8")) {
        System.out.println(" * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        }
        else if(lol.equals("9")) {
        System.out.println(" * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println(" * * *");
        }
        else if(lol.equals("0")) {
        System.out.println(" * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println();
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" * * *");
        }
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
