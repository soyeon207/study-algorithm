import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 초과
public class 10986_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int num[] = new int[N+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=1;i<=N;i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken()) + num[i-1];
        }
        
        int startIdx = 1;
        int endIdx = 1;
        int count = 0;
        
        while (startIdx < N+1) {
            if ((num[endIdx] - num[startIdx-1]) % M == 0) {
                count ++;
            }
            endIdx++;
            if (endIdx > N) {
                startIdx ++;
                endIdx = startIdx;
            }
        }
        System.out.println(count);
    }
}