import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0;
        int temp_sum = 0;
        
        for(int i=1;i<=N;i++) {
            temp_sum = 0;
            // i 에서 N 까지 더해본다. 
            for(int j = i;j<=N;j++) {
                temp_sum += j;
                if (temp_sum == N) {
                    count ++;
                    break;
                } else if (temp_sum > N) {
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}