import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.nextLine();
    int machine1 = sc.nextInt();
    sc.nextLine();
    int machine2 = sc.nextInt();
    sc.nextLine();
    int machine3 = sc.nextInt();

    int timePlayed = 0;
    while(num > 0) {
      machine1++;
      timePlayed++;
      num--;
      if(machine1 >=35) {
        num += 30;
        machine1 = 0;
      }

      if(num == 0) {
        break;
      }

      machine2++;
      timePlayed++;
      num--;
      if(machine2 >= 100) {
        num += 60;
        machine2 = 0;
      }

      if(num == 0) {
        break;
      }

      machine3++;
      timePlayed++;
      num--;
      if(machine3 >= 10) {
        num += 9;
        machine3 = 0;
      }
    }

    System.out.println("Martha plays " + timePlayed + " times before going broke.");
  }
}
