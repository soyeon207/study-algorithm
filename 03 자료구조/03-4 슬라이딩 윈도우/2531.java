import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2531번 회전초밥
public class 2531 {
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

        int start = 0, end = k - 1;
        int includeCoupon = 0, total_count = 0;

        while (start < N) {
            if (start == 0) {
                for (int i = start; i <= end; i++) {
                    dArr[sushi[i]]++;
                    if (sushi[i] == c) includeCoupon++;
                }
            } else {
                int beforeSushi = sushi[start - 1];
                int addSushi = sushi[end % N];
                dArr[beforeSushi]--;
                dArr[addSushi]++;

                if (beforeSushi == c) includeCoupon--;
                if (addSushi == c) includeCoupon++;

                boolean isCoupon = (includeCoupon >= 1);

                int sushiCount = 0;
                for (int i = 1; i <= d; i++) {
                    if (dArr[i] > 0 && (i != c || isCoupon)) {
                        sushiCount++;
                    }
                }
                
                if (total_count < sushiCount + (isCoupon ? 0 : 1)) {
                    total_count = sushiCount + (isCoupon ? 0 : 1);
                }
                
                if (total_count == k+1) break;
            }

            start++;
            end++;
        }

        System.out.println(total_count);

    }
}