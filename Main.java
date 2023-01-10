import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i =0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int start_idx, end_idx;
        int count = 0;

        for (int i = N-1;i>=0;i--) {
            start_idx = 0;
            end_idx = i-1;
            while (start_idx < end_idx) {
                if (arr[start_idx] + arr[end_idx] == arr[i]) {
                    count ++;
                    break;
                } else if (arr[start_idx] + arr[end_idx] < arr[i]) {
                    start_idx ++;
                } else {
                    end_idx --;
                }
            }
        }

        
        System.out.println(count);
    
    }
}