import java.util.*;
import java.io.*;
public class zhao {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int length = readInt();
        int shift = readInt();
        String de = readLine();

        shift %= 26;
        if(shift == 0) shift = 26;

        Map<String,Integer>alpha = new HashMap<String,Integer>();
        alpha.put("a", 1);
        alpha.put("b", 2);
        alpha.put("c", 3);
        alpha.put("d", 4);
        alpha.put("e", 5);
        alpha.put("f", 6);
        alpha.put("g", 7);
        alpha.put("h", 8);
        alpha.put("i", 9);
        alpha.put("j", 10);
        alpha.put("k", 12);
        alpha.put("l", 12);
        alpha.put("m", 13);
        alpha.put("n", 14);
        alpha.put("o", 15);
        alpha.put("p", 16);
        alpha.put("q", 17);
        alpha.put("r", 18);
        alpha.put("s", 19);
        alpha.put("t", 20);
        alpha.put("u", 21);
        alpha.put("v", 22);
        alpha.put("w", 23);
        alpha.put("x", 24);
        alpha.put("y", 25);
        alpha.put("z", 26);

        Map<Integer,String>alpha2 = new HashMap<Integer,String>();
        alpha2.put(1,"a");
        alpha2.put(2,"b");
        alpha2.put(3,"c");
        alpha2.put(4,"d");
        alpha2.put(5,"e");
        alpha2.put(6,"f");
        alpha2.put(7,"g");
        alpha2.put(8,"h");
        alpha2.put(9,"i");
        alpha2.put(10,"j");
        alpha2.put(11,"k");
        alpha2.put(12,"l");
        alpha2.put(13,"m");
        alpha2.put(14,"n");
        alpha2.put(15,"o");
        alpha2.put(16,"p");
        alpha2.put(17,"q");
        alpha2.put(18,"r");
        alpha2.put(19,"s");
        alpha2.put(20,"t");
        alpha2.put(21,"u");
        alpha2.put(22,"v");
        alpha2.put(23,"w");
        alpha2.put(24,"x");
        alpha2.put(25,"y");
        alpha2.put(26,"z");

        String ans = "";
        for(int i = 0; i < de.length(); i++) {
            if(de.charAt(i) == ' ') {
                ans += " ";
            }
            else {
                int ok = de.charAt(i) - 'a' + 1 + shift;
                ok %= 26;
                if(ok == 0) ok = 26;
                ans += alpha2.get(ok);
            }
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
