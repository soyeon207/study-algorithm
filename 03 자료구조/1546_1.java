import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double score[] = new double[N];
        double max = 0;
        
        for(int i=0;i<N;i++) {
            score[i] = sc.nextDouble();
            if (max < score[i]) max = score[i];
        }
        
        double avg = 0;
        for(int i =0;i<N;i++) {
            avg += (score[i]/max*100);
        }
        
        System.out.println(avg/N);
    }
}