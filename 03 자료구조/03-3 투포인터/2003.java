import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2003번 수들의 합 2
public class 2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[] = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int temp = 0;
        int startIdx = 0, endIdx = 0, count = 0;
        while (startIdx < N) {
            temp += A[endIdx];
            // temp 가 M 과 같은 경우 count ++
            if (temp == M) count++;

            endIdx ++;
            // endIdx 가 N 의 배열 크기를 넘거나
            // temp 가 M 보다 큰 경우 startIdx 를 +1 해준다.
            if (endIdx >= N || temp > M) {
                startIdx++;
                endIdx = startIdx;
                temp = 0;
            }
        }
        System.out.println(count);
    }
}