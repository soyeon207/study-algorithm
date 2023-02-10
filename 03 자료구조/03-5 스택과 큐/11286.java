import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);

            if (firstAbs == secondAbs) return o1 > o2 ? 1 : -1;
            else return firstAbs - secondAbs;
        });

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 0) {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            } else {
                queue.add(temp);
            }

        }
    }
}