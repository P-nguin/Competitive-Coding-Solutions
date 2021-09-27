import java.math.BigInteger;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.nextLine();
    
    for(int i = 0; i < num; i++) {
      int remove = sc.nextInt();
      String hi = sc.nextLine();
      System.out.println(i+1 + " " + hi.substring(1,remove) + hi.substring(remove + 1, hi.length()));
    }
  }
}
