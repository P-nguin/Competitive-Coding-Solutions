import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int pink = readInt();
        int green = readInt();
        int red = readInt();
        int orange = readInt();
        int target = readInt();

        int amount = 0;
        boolean shouldWork = true;
        int smallest = 100000000;
        for(int p = 0; p <= target/pink; p++) {
            for(int g = 0; g <= target/green; g++) {
                for(int r = 0; r <= target/red; r++) {
                    for(int o = 0; o <= target/orange; o++) {
                        if(p*pink + g*green + r*red + o*orange == target) {
                            System.out.println("# of PINK is " + p + " # of GREEN is " + g + " # of RED is " + r + " # of ORANGE is " + o);
                            amount++;

                            smallest = Math.min(smallest, p+g+r+o);
                        }
                        else if(p*pink + g*green + r*red + o*orange > target) {
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Total combinations is " + amount + ".");
        System.out.println("Minimum number of tickets to print is " + smallest + ".");
    }

    static boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num % 2 == 0 && num != 2) return false;
        for(int i = 3; i*i < num + 1; i += 2) {
            if(num % i == 0) return false;
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
