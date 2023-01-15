import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 11003_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Deque<Node> deque = new LinkedList<>();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(stringTokenizer.nextToken());
            while (!deque.isEmpty() && deque.getLast().getValue() > n) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, n));
            if (deque.getFirst().getIndex() <= i - L) deque.removeFirst();
            bufferedWriter.write(deque.getFirst().getValue()+ " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return this.index;
        }

        public int getValue() {
            return this.value;
        }
    }
}