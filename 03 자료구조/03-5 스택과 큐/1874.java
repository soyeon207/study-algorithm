import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 내가 푼 방법
public class 1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        int[] nArr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        // targetN = 더해줘야 하는 대상 정수
        int nArrIdx = 0, targetN = 0;
        while (nArrIdx < n) {
            // nArrIdx >= n 인 경우에는 모든 수열의 수를 확인한거기 때문에 nArrIdx < n 까지 반복
            if ((stack.empty() && targetN == n) || targetN > n) {
                // 1. 더해줘야 하는 대상 정수를 모두 더했는데 반복이 끝나지 않은 경우
                // 2. stack 에 있는 값 < targetN 이라서 push 를 한 경우
                sb.setLength(0);
                sb.append("NO");
                break;
            } else if (stack.empty() || nArr[nArrIdx] > stack.peek()) {
                // stack top 의 값이 nArr[nArrIdx] 보다 작은 경우 stack 에 데이터를 더 넣어줘야함
                sb.append("+\n");
                stack.push(++targetN);
            } else if (nArr[nArrIdx] <= stack.peek()) {
                // stack top 의 값이 nArr[nArrIdx] 보다 같거나 큰 경우
                // stack 에 있는 데이터를 삭제해줘야 한다.
                sb.append("-\n");
                if (nArr[nArrIdx] == stack.peek()) nArrIdx++;
                stack.pop();
            }
        }

        System.out.println(sb);
    }
}