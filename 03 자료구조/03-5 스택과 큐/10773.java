import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == 0) stack.pop();
            else stack.push(number);
        }
        
        int sum = 0;
        while(!stack.empty()) {
            sum += stack.pop();
        }

        System.out.println(sum);

    }
}