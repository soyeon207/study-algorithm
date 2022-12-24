import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int temp;

		int in[] = new int[1001];
		
		for(int i=0;i<n;i++) 
			in[i] = sc.nextInt();

		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(in[i]>in[j]) {
					temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) 
			System.out.println(in[i]);
	}
}
