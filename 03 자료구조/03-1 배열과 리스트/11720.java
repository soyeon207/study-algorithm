import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 숫자의 개수 
        String num = sc.next(); // 숫자 N
        int sum = 0;
        // 숫자를 100개까지 받을 수 있기 때문에 char 배열로 
        // 변환해서 값을 더해줌
        char[] charNumArr = num.toCharArray();
        
        for(char ch:charNumArr) {
            // 문자열 숫자에서 0 을 빼서 실제 숫자를 구함
            sum += ch - '0';
        }
        
        System.out.println(sum);
    }
}