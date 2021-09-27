import java.math.BigInteger;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nums = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < nums; i++) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();
      BigInteger c = sc.nextBigInteger();

      if(a.multiply(b).equals(c)) {
        System.out.println("POSSIBLE DOUBLE SIGMA");
      }
      else {
        System.out.println("16 BIT S/W ONLY");
      }
    }
  }
}
