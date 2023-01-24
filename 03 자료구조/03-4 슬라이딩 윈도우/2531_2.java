import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2531번 회전초밥
public class 2531_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 놓인 접시의 수
        int d = Integer.parseInt(stringTokenizer.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(stringTokenizer.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(stringTokenizer.nextToken()); // 쿠폰 번호

        int[] dArr = new int[d + 1];
        int[] sushi = new int[N];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int startIdx = 0, endIdx = k - 1;
        int maxCount = 0, tempMaxCount = 0, minusSushi, addSushi;

        while (startIdx < N) {
            if (startIdx == 0) {
                for (int i = startIdx; i <= endIdx; i++) {
                    if (dArr[sushi[i]] == 0) maxCount++;
                    dArr[sushi[i]]++;
                }
                tempMaxCount = maxCount;
            } else {
                // 삭제된 초밥 처리
                minusSushi = sushi[startIdx - 1];
                dArr[minusSushi]--;
                if (dArr[minusSushi] == 0) tempMaxCount--;

                // 추가된 초밥 처리
                addSushi = sushi[endIdx % N];
                dArr[addSushi]++;
                if (dArr[addSushi] == 1) tempMaxCount++;

                int addCouponMaxCount = tempMaxCount + (dArr[c] == 0 ? 1 : 0);
                if (maxCount < addCouponMaxCount) {
                    maxCount = addCouponMaxCount;
                    if (maxCount == k + 1) break;
                }
            }

            startIdx++;
            endIdx++;
        }
        System.out.println(maxCount);
    }
}