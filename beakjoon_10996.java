
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1)
			System.out.println("*");
		else {
			for(int i=1; i<=n*2; i++)
			{
				if(i % 2 == 1)
				//Ȧ�� �� ���
				{
					if(n % 2 == 0) //n�� ¦����
					{
						for(int j=1; j<=n/2; j++)
							System.out.print("* ");
						System.out.println();
					}
				
					else
					{
						for(int j=1; j<=(n+1)/2; j++)
							System.out.print("* ");
						System.out.println();
					}
				}
				else
				//¦�� �� ���
				{
					for(int j=1; j<=n/2; j++)
						System.out.print(" *");
					System.out.println();
				}
			}
		}
	}
}