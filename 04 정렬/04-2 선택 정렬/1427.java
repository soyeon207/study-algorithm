import java.util.Arrays;
import java.util.Scanner;

public class 1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        String[] nSplit = N.split("");

        for (int i = 0; i < nSplit.length; i++) {
            for (int j = i + 1; j < nSplit.length; j++) {
                if (Integer.parseInt(nSplit[i]) < Integer.parseInt(nSplit[j])) {
                    String temp = nSplit[j];
                    nSplit[j] = nSplit[i];
                    nSplit[i] = temp;
                }
            }
        }

        for (String s : nSplit) {
            System.out.print(s);
        }
    }
}
