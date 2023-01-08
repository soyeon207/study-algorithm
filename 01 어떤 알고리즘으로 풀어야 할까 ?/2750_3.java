import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 병합 정렬 사용 
        // 시간 복잡도가 O(nlogn) 이기 때문에 해당 문제에 적합하다. 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num_arr[] = new int[N];

        for(int i=0;i<N;i++) {
            num_arr[i] = sc.nextInt();
        }

        mergeSort(num_arr, 0, num_arr.length-1);

        for(int num:num_arr) {
            System.out.println(num);
        }
    }
    
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int[] tmp = new int[arr.length];
            int mid = (start+end) / 2;
            // start < end 가 아닐 때까지 재귀호출 
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            // start 가 mid 보다 작거나 
            // mid + 1 이 end 보다 작은 동안 반복
            while (p <= mid || q <= end) {
                // 병합 정렬은 두 개로 나눠서 비교하기 때문에 arr[p] < arr[q] 보다 작은 경우 
                // idx 에다가 해당 값을 넣어준다. 
                if (q > end || (p <= mid && arr[p] < arr[q])) {
                    tmp[idx++] = arr[p++];
                } else {
                    tmp[idx++] = arr[q++];
                }
            }

            for (int i = start; i <= end; i++) {
                arr[i] = tmp[i];
            }
        }
    }
}