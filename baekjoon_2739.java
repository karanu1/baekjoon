import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			//9�� �ݺ�
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}