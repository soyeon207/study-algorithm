import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2096번 내려가기
public class 2096 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] maxArr = new int[3];
        int[] minArr = new int[3];
        StringTokenizer stringTokenizer;
        int x1, x2, x3;

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x1 = Integer.parseInt(stringTokenizer.nextToken());
            x2 = Integer.parseInt(stringTokenizer.nextToken());
            x3 = Integer.parseInt(stringTokenizer.nextToken());

            if (i == 0) {
                maxArr[0] = minArr[0] = x1;
                maxArr[1] = minArr[1] = x2;
                maxArr[2] = minArr[2] = x3;
            } else {
                int beforeMinArr0 = minArr[0];
                int beforeMinArr2 = minArr[2];
                minArr[0] = Math.min(beforeMinArr0, minArr[1]) + x1; // [0], [1] 비교
                minArr[2] = Math.min(minArr[1], beforeMinArr2) + x3; // [1], [2] 비교
                minArr[1] = Math.min(Math.min(beforeMinArr0, minArr[1]), beforeMinArr2) + x2; // [0], [1], [2] 비교

                int beforeMaxArr0 = maxArr[0];
                int beforeMaxArr2 = maxArr[2];
                maxArr[0] = Math.max(beforeMaxArr0, maxArr[1]) + x1; // [0], [1] 비교
                maxArr[2] = Math.max(maxArr[1], beforeMaxArr2) + x3; // [1], [2] 비교
                maxArr[1] = Math.max(Math.max(beforeMaxArr0, maxArr[1]), beforeMaxArr2) + x2; // [0], [1], [2] 비교
            }
        }

        int max_value = 0, min_value = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (max_value < maxArr[i]) max_value = maxArr[i];
            if (min_value > minArr[i]) min_value = minArr[i];
        }

        System.out.println(max_value + " " + min_value);
    }
}