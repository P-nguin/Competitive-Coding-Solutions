import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int place = 1;

    int[][] ladders = { { 9, 25 }, { 40, 24 }, { 67, 19 } };

    int[][] snakes = { { 54, 35 }, { 90, 42 }, { 99, 22 } };

    while (true) {
      int dice = sc.nextInt();
      if (dice == 0)
        break;
      sc.nextLine();

      place += dice;
      if(place == 100) {
        System.out.println("You are now on square 100");
        System.out.println("You Win!");
        return;
      }

      if (place < 100) {
        for (int i = 0; i < 3; i++) {
          if (place == ladders[i][0]) {
            place += ladders[i][1];
          } else if (place == snakes[i][0]) {
            place -= snakes[i][1];
          }
        }
      }
      else {
        place -= dice;
      }
      System.out.println("You are now on square " + place);
    }

    System.out.println("You Quit!");
  }
}
