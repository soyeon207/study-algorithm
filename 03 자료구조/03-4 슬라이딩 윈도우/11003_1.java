// 성공 못함 ㅠㅠ
public class 11003_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());

        int nArr[] = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i =0;i<nArr.length;i++) {
            nArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int min = nArr[0];
        int minIdx = 0;
        System.out.print(min);

        for(int i=1;i<N;i++) {
            System.out.println("minIdx : "+minIdx);
            if (min >= nArr[i]) {
                min = nArr[i];
                minIdx = i;
            }

            if (i - L >= minIdx) {
                min = nArr[i - L];
                minIdx = i;
                for(int j= i-L+1;j<i;j++) {
                    if (min > nArr[j]) {
                        min = nArr[j];
                        minIdx = j;
                    }
                }
            }
            System.out.print(" "+min);
        }
    }

}
