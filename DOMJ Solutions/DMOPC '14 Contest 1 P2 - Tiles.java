import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int width = sc.nextInt();
    sc.nextLine();
    int tileDim = sc.nextInt();

    int newLength = (int)length/tileDim;
    int newWidth = (int)width/tileDim;

    System.out.println(newLength*newWidth);
  }
}
