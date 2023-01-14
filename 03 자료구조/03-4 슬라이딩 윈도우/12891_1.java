import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 12891_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int s = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());

        String dnaStr = bufferedReader.readLine();
        String[] dnaStrArr = dnaStr.split("");

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());
        int G = Integer.parseInt(stringTokenizer.nextToken());
        int T = Integer.parseInt(stringTokenizer.nextToken());

        int startIdx = 0, endIdx = p-1, count = 0;

        while (endIdx < s) {
            if (startIdx == 0) {
                for(int i = startIdx; i<= endIdx;i++) {
                    if (dnaStrArr[i].equals("A")) A --;
                    else if (dnaStrArr[i].equals("C")) C --;
                    else if (dnaStrArr[i].equals("G")) G --;
                    else if (dnaStrArr[i].equals("T")) T --;
                }
            } else {
                if (dnaStrArr[endIdx].equals("A")) A --;
                else if (dnaStrArr[endIdx].equals("C")) C --;
                else if (dnaStrArr[endIdx].equals("G")) G --;
                else if (dnaStrArr[endIdx].equals("T")) T --;
            }

            if (A <= 0 && C <=0 && G <= 0 && T <=0) {
                count++;
            }

            if (dnaStrArr[startIdx].equals("A")) A ++;
            else if (dnaStrArr[startIdx].equals("C")) C ++;
            else if (dnaStrArr[startIdx].equals("G")) G ++;
            else if (dnaStrArr[startIdx].equals("T")) T ++;

            startIdx++;
            endIdx ++;
        }

        System.out.println(count);

    }
}