import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        String[] c = readLine().split("");
        System.out.println("Cards Dealt              Points");
        String s = "Clubs ";
        int p = 0;
        int ac = 0;
        int pt = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i].equals("C")) {
                continue;
            }
            else if(c[i].equals("D")) {
                if(ac == 0) p += 3;
                else if(ac == 1) p += 2;
                else if (ac == 2) p += 1;
                s += " " + p;
                System.out.println(s);
                s = "Diamonds ";
                ac = 0;
                pt += p;
                p = 0;
                continue;
            }
            else if(c[i].equals("H")) {
                if(ac == 0) p += 3;
                else if(ac == 1) p += 2;
                else if (ac == 2) p += 1;
                s += " " + p;
                System.out.println(s);
                s = "Hearts ";
                ac = 0;
                pt += p;
                p = 0;
                continue;
            }
            else if(c[i].equals("S")) {
                if(ac == 0) p += 3;
                else if(ac == 1) p += 2;
                else if (ac == 2) p += 1;
                s += " " + p;
                System.out.println(s);
                s = "Spades ";
                ac = 0;
                pt += p;
                p = 0;
                continue;
            }

            s += c[i] + " ";
            ac++;

            if(c[i].equals("A")) {
                p += 4;
            }
            else if(c[i].equals("K")) {
                p+=3;
            }
            else if(c[i].equals("Q")) {
                p += 2;
            }
            else if(c[i].equals("J")) {
                p += 1;
            }
        }

        if(ac == 0) p += 3;
        else if(ac == 1) p += 2;
        else if (ac == 2) p += 1;
        s += " " + p;
        System.out.println(s);
        pt += p;

        System.out.println("                       Total " + pt);
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
