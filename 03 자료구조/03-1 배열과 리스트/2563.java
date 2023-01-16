import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int paperCount = Integer.parseInt(bufferedReader.readLine());
        int[][] paperArr = new int[101][101];
        int size = 0;

        for (int i = 0; i < paperCount; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (paperArr[x + j][y + k] != 1) {
                        paperArr[x + j][y + k] = 1;
                        size++;
                    }
                }
            }
        }
        
        System.out.println(size);
    }
}