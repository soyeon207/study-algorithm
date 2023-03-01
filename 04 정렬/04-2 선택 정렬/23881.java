import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 23881 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int a[] = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int Max = 0;
        int maxIdx = -1;
        int swapCount = 0;

        for (int i = 1; i <= a.length; i++) {
            maxIdx = -1;
            Max = a[a.length - i];

            for (int j=a.length-i-1;j>=0;j--) {
                if (a[j] > Max) {
                    maxIdx = j;
                    Max = a[j];
                }
            }

            if (maxIdx != -1) {
                swapCount ++;
                if (swapCount == K) {
                    System.out.println((a[a.length - i]) + " "+a[maxIdx]);
                    return;
                }
                swap(a, maxIdx, a.length - i);
            }
        }
        System.out.println("-1");
    }

    public static void swap(int[] arr, int startIdx, int endIdx) {
        int temp = arr[startIdx];
        arr[startIdx] = arr[endIdx];
        arr[endIdx] = temp;
    }
}