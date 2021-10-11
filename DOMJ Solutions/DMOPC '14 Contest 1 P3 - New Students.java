import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int days = sc.nextInt();
    sc.nextLine();

    Loging[] l = new Loging[days];

    for(int i = 0; i < days; i++) {
      int logs = sc.nextInt();
      sc.nextLine();

      l[i] = new Loging(logs, i);

      for(int k = 0; k < logs; k++) {
        l[i].data[k] = sc.nextInt();
        sc.nextLine();
      }
    }

    for(int i = 0; i < days; i++) {
      if(l[i].Sum() == 0) {
        System.out.println("Weekend");
        continue;
      }
      System.out.println("Day " + (i + 1) + ": " + l[i].Sum());
    }
  }
}

class Loging {
  int[] data;
  int code;
  public Loging(int size, int code) {
    data = new int[size];
    this.code = code;
  }

  public int Sum() {
    int ans = 0;
    for(int i = 0; i < data.length; i++) {
      ans += data[i];
    }
    return ans;
  }
}
