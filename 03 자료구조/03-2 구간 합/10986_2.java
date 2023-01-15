import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 10986_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[N+1];
        long[] C = new long[M];
        long count = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=1;i<=N;i++) {
            S[i] = (Long.parseLong(stringTokenizer.nextToken()) + S[i-1]) % M;
            if (S[i] == 0) count++;
            C[(int) S[i]]++;
        }
        
        for(int i=0;i<M;i++) {
            if (C[i] > 1) {
                count += (C[i] * (C[i]-1) / 2);
            }
        }
        
        System.out.println(count);
    }
}