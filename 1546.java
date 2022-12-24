import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;
		float average = 0;

		int score[] = new int[1000];

		for(int i=0;i<n;i++) {
		score[i] = sc.nextInt();
		if(max<score[i])
			max = score[i];
		}
		for(int j=0;j<n;j++) 
			average += ((float)score[j]/max*100);

		System.out.format("%.2f",average/n);
	}
}