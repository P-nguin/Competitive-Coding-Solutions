import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.nextLine();

    int[] p1 = new int[num];
    int[] p2 = new int[num];

    for(int i = 0; i < num; i++) {
      p1[i] = sc.nextInt();
    }
    sc.nextLine();

    for(int i = 0; i < num; i++) {
      p2[i] = sc.nextInt();
    }

    boolean war = false;
    int wars = 0;
    for(int i = 0; i < num; i++) {
      if(p1[i] == p2[i] && !war) {
        war = true;
        wars++;
      }
      else if(p1[i] != p2[i]) {
        war = false;
      } 
    }

    System.out.println(wars);
  }
}
