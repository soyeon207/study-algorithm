import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 내가 푼 거 ㅠㅠ
public class 11660_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int arr[][] = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken()) + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }
        }
        
        int x1,y1,x2,y2;
        for (int i=0;i<M;i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x1 = Integer.parseInt(stringTokenizer.nextToken());
            y1 = Integer.parseInt(stringTokenizer.nextToken());
            x2 = Integer.parseInt(stringTokenizer.nextToken());
            y2 = Integer.parseInt(stringTokenizer.nextToken());
            
            System.out.println(arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1]);
        }
    }
}