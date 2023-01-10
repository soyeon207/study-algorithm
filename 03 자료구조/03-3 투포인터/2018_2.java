import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0, sum = 1;
        int start_idx = 1, end_idx = 2;
        
        while (start_idx <= N) {
            if (sum < N) {
                sum += end_idx;
                end_idx ++;
            } else if (sum > N) {
                start_idx ++; end_idx = start_idx +1; sum = start_idx;
            } else {
                count ++; start_idx ++; end_idx = start_idx +1; sum = start_idx;
            }
        }
        
        System.out.println(count);
    }
}