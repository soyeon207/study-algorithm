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
        
        for(int j=0;j<N;j++) {
            for(int k=j+1;k<N;k++) {
                if (num_arr[j] > num_arr[k]) {
                    int temp = num_arr[j];
                    num_arr[j] = num_arr[k];
                    num_arr[k] = temp;
                }
            }
        }
        
        for(int num:num_arr) System.out.println(num);
    }
}