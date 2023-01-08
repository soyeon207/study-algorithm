import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 자바의 Arrays.sort 사용 
        // 내부적으로는 DualPivotQuicksort 를 사용하는데 평균 : O(nlog(n)) / 최악 : O(n^2) 이다. 

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int num_arr[] = new int[N];
        
        for(int i=0;i<N;i++) {
            num_arr[i] = sc.nextInt();
        }
        
        Arrays.sort(num_arr);
        for(int num:num_arr) System.out.println(num);
    }
}