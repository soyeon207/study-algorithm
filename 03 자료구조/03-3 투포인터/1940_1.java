import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int arr[] = new int[N];
        for(int i =0;i<N;i++) {
            arr[i] = sc.nextInt();
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
                endIdx -- ;
            }
        }
        
        System.out.println(count);
    
    }
}