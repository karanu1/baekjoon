import java.util.Scanner;

//baekjoon_2742 ���� N
//2741�� ������ �������� ���
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
	}
}