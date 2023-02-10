import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        Stack<String> stack;
        boolean no;

        for (int i = 0; i < T; i++) {
            String number = bufferedReader.readLine();
            stack = new Stack<>();
            no = false;
            for (String s : number.split("")) {
                if (s.equals("(")) {
                    stack.push("(");
                } else if (stack.empty()) {
                    no = true;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (no || !stack.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}