import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] origin_graph = new int[N+1][N+1];
        int[][] graph = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= N; j++) {
                origin_graph[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                graph[i][j] = graph[i-1][j] + graph[i][j-1] - graph[i-1][j-1] + origin_graph[i][j];
            }
        }

        int w, x, y, c,t,x1,y1,x2,y2;
        for(int i=0;i<M;i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            w = Integer.parseInt(stringTokenizer.nextToken());
            if (w == 0) {
                x = Integer.parseInt(stringTokenizer.nextToken());
                y = Integer.parseInt(stringTokenizer.nextToken());
                c = Integer.parseInt(stringTokenizer.nextToken());
                t = (origin_graph[x][y] - c);
                for(int j=x;j<=N;j++) {
                    for(int k = y;k<=N;k++) {
                        graph[j][k] -= t;
                    }
                }
            } else {
                x1 = Integer.parseInt(stringTokenizer.nextToken());
                y1 = Integer.parseInt(stringTokenizer.nextToken());
                x2 = Integer.parseInt(stringTokenizer.nextToken());
                y2 = Integer.parseInt(stringTokenizer.nextToken());
                System.out.println(graph[x2][y2] - graph[x2][y1-1] - graph[x1-1][y2] + graph[x1-1][y1-1]);
            }
        }
    }
}