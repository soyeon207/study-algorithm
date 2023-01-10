import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i =0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int startIdx = 0;
        int endIdx = N - 1;
        int count = 0;
        
        while (startIdx < endIdx) {
            if (arr[startIdx] + arr[endIdx] < M) {
                startIdx ++;
            } else if (arr[startIdx] + arr[endIdx] > M) {
                endIdx -- ;
            } else {
                count ++;
                startIdx ++;
                endIdx -- ;
            }
        }
        
        System.out.println(count);
    
    }
}