import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
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