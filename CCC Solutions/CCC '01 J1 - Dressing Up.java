import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int half = (int)size/2;
    if(size % 2 == 0) {
      half--;
    }

    int num = 1;
    int mun = size;
    for(int i = 0; i < size; i++) {
      String inProg = "";
      for(int k = 0; k < size; k++) {
        if(k <= num - 1) {
          inProg += "*";
        }
        else {
          inProg += " ";
        }
      }
      for(int k = 0; k < size; k++) {
        if(k >= mun - 1) {
          inProg += "*";
        }
        else {
          inProg += " ";
        }
      }
      System.out.println(inProg);

      if(i < half) {
        num += 2;
        mun -= 2;
      }
      else {
        num -= 2;
        mun += 2;
      }
    }
  }
}
