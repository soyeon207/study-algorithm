import java.util.Scanner;

public class 2752 {
          public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        boolean isSwap;
        for (int i = 1; i <= num.length; i++) {
            isSwap = false;
            for(int j=0;j<num.length - i;j++) {
                if (num[j] > num[j+1]) {
                    swap(num, j, j+1);
                    isSwap = true;
                }
            }
            if (isSwap == false) break;
        }

        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }

    public static void swap(int arr[], int startIdx, int endIdx) {
        int temp = arr[startIdx];
        arr[startIdx] = arr[endIdx];
        arr[endIdx] = temp;
    }
}