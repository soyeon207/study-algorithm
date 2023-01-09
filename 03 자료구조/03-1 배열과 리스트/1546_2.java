import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score[] = new int[N];
        
        for(int i=0;i<N;i++) {
            score[i] = sc.nextInt();
        }
        
        long max = 0;
        long total = 0;
        for(int i =0;i<N;i++) {
            if (max < score[i]) max = score[i];
            total += score[i];
        }
        
        System.out.println((total/(double)max*100)/N);
    }
}