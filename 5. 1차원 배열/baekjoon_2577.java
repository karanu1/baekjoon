import java.util.Scanner;

//baekjoon_2577
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		while(sum>0) {
			ar[sum%10]++;
			sum /= 10;
		}
		for(int i=0; i<10; i++)
			System.out.println(ar[i]);
	}
}