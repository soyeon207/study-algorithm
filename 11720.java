import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String C = sc.next(); // 문자열을 입력 받음

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += (int)C.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}