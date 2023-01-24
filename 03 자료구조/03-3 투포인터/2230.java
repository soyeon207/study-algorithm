import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2230번 수 고르기
public class 2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[] = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }
        
        Arrays.sort(A);
        
        int start = 0, end = 0, div = Integer.MAX_VALUE;
        while (start < N && end < N) {
            int divValue = A[end] - A[start];
            if (divValue == M) {
                div = divValue;
                break;
            }
            
            if (divValue >= M) {
                if (divValue < div) div = divValue;
                start++;
            } else {
                end++;
            }
        }
        
        System.out.println(div);
    }
}