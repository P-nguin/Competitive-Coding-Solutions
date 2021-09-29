import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int r = readInt();
        int c = readInt();

        String[][] grid = new String[r][c];
        for(int i = 0; i < r; i++) {
            grid[i] = readLine().split("");
        }

        int amount = readInt();
        String[] moves = new String[amount];
        for(int i = 0; i < amount; i++) {
            moves[i] = readLine();
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j].equals("X")) continue;

                for(int k = 0; k < 4; k++) {
                    int dir = k;
                    int curR = i;
                    int curC = j;
                    boolean flag = true;

                    for(int l = 0; l < amount; l++) {
                        if(moves[l].equals("F")) {
                            if(dir == 0) {
                                curR -= 1;
                            }
                            else if(dir == 1) {
                                curC += 1;
                            }
                            else if(dir == 2) {
                                curR += 1;
                            }
                            else {
                                curC -= 1;
                            }
                        }
                        else if(moves[l].equals("R")) {
                            dir = (dir+1)%4;
                        }
                        else {
                            dir = (dir-1+4)%4;
                        }

                        if(curR < 0 || curR >= r || curC < 0 || curC >= c || grid[curR][curC].equals("X")) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        grid[curR][curC] = "*";
                    }
                }
            }
        }

        for(int i = 0; i < r; i++) {
            String done = "";
            for(int j = 0; j < c; j++) {
                done += grid[i][j];
            }
            System.out.println(done);
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
