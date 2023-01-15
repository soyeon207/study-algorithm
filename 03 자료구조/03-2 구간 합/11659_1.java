import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수의 개수 
        int N = sc.nextInt();
        // 합을 구해야 하는 횟수
        int M = sc.nextInt();
        // 구간 합
        int sum_num[] = new int[N];
        
        for(int i=0;i<N;i++) {
            sum_num[i] = sc.nextInt() + (i==0 ? 0 : sum_num[i-1]);
        }
        
        int i, j;
        for(int k=0;k<M;k++) {
            i = sc.nextInt();
            j = sc.nextInt();
            System.out.println(sum_num[j-1] - (i-1 <= 0 ? 0 : sum_num[i-2]));
        }
        
    }
}