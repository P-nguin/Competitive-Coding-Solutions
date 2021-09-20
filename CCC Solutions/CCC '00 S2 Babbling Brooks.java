import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        List<Float> streams = new LinkedList<Float>();
        for(int i = 0; i < num; i++) {
            streams.add(sc.nextFloat());
            sc.nextLine();
        }

        while(true) {

            int op = sc.nextInt();
            if(op == 77) {
                break;
            }

            if(op == 99) {
                int streamNum = sc.nextInt();
                sc.nextLine();
                int a = sc.nextInt();
                sc.nextLine();
                float temp = streams.get(streamNum-1);
                streams.set(streamNum-1, streams.get(streamNum-1) * a/100);
                streams.add(streamNum, temp - streams.get(streamNum-1));
            }
            else {
                int streamNum = sc.nextInt();
                sc.nextLine();

                streams.set(streamNum-1, streams.get(streamNum) + streams.get(streamNum-1));
                streams.remove(streamNum);
            }
        }

        String r = "";
        for(float i:streams) {
            r += Math.round(i) + " ";
        }
        System.out.println(r);
    }
}
