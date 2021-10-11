import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nums = sc.nextInt();
    sc.nextLine();

    int[] hi = new int[nums];
    for(int i = 0; i < nums; i++) {
      hi[i] = sc.nextInt();
      sc.nextLine();
    }

    Arrays.sort(hi);
    
    int med = 0;
    if(nums%2 == 0) {
      if((hi[nums/2-1] + hi[nums/2])%2 != 0) {
        med = (hi[nums/2-1] + hi[nums/2])/2 + 1;
      }
      else med = (hi[nums/2-1] + hi[nums/2])/2;
    }
    else {
      med = hi[(nums+1)/2-1];
    }

    System.out.println(med);
  }
}
