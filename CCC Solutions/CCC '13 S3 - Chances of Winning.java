import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static int points[] = new int[5], T, ans, rem;
    static boolean[][] games = new boolean[5][5];
    public static void main(String [] args) throws IOException{
        T = readInt(); 
        int g = readInt();
        rem = 6 - g;
        for(int i = 0; i < g; i++) {
            int t1 = readInt(), t2 = readInt(), s1 = readInt(), s2 = readInt();
            games[t1][t2] = games[t2][t1] = true;
            if(s1 > s2) {
                points[t1]+=3;
            }
            else if(s2 > s1) {
                points[t2]+=3;
            }
            else {
                points[t1]++; points[t2]++;
            }
        }

        f(); System.out.println(ans);
    }

    static void f() {
        if(rem == 0) {
            for(int i = 1; i <= 4; i++) {
                if(points[i] >= points[T] && i != T) {
                    return;
                }
            }

            ans++;
            return;
        }

        boolean[][] backUp = new boolean[5][5];
        for(int i = 0; i < backUp.length; i++) {
            backUp[i] = games[i].clone();
        }
        for(int i = 1; i <= 4; i++) {
            for(int j = i+1; j <= 4; j++) {
                if(!games[i][j]) {
                    games[i][j] = true; rem --;
    				for(int k=0; k<3; k++){
    					if(k==0){ points[i] += 3; f(); points[i]-=3; }
    					if(k==1){ points[j] += 3; f(); points[j]-=3; }
    					if(k==2){ points[i]++; points[j]++; f(); points[i]--; points[j]--; }
    				}
    				rem++;
                }
            }
        }

        for(int i = 0; i < backUp.length; i++) {
            games[i] = backUp[i].clone();
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
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
