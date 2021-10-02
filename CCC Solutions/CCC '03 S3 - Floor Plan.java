import java.util.*;
import java.io.*;

public class Pratice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int wood = readInt();
        int R = readInt(), C = readInt();
        boolean[][] grid = new boolean[R][C];
        for(int i = 0; i < R; i++) {
            String ok =readLine();
            for(int j = 0; j < C; j++) {
                grid[i][j] = ok.charAt(j) == '.';
            }
        }

        ArrayList<Integer> rooms = new ArrayList<>();
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if(grid[r][c]) {
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[] {r,c});
                    
                    int size = 0;
                    grid[r][c] = false;

                    while(!q.isEmpty()) {
                        int[] coords = q.remove();
                        size++;

                        for(int i = 0; i < 4; i++) {
                            int nCoordX = coords[0]+dir[i][0];
                            int nCoordY = coords[1]+dir[i][1];
                            if(nCoordX >= 0 && nCoordX < R && nCoordY >= 0 && nCoordY < C && grid[nCoordX][nCoordY]) {
                                q.add(new int[] {nCoordX, nCoordY});
                                grid[nCoordX][nCoordY] = false;
                            }
                        }
                    }
                    rooms.add(size);
                }
            }
        }

        Collections.sort(rooms);
        int ans = 0;
        for(int i = rooms.size()-1; i >= 0; i--) {
            if(rooms.get(i) > wood) {
                if(ans == 1) {
                    System.out.println("1 room, " + wood + " square metre(s) left over");
                    return;
                }
                else {
                    break;
                }
            }
            wood -= rooms.get(i);
            ans++;
        }

        System.out.println(ans + " rooms, " + wood + " square metre(s) left over");
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
