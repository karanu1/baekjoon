import java.util.Scanner;

//baekjoon_11022 A+B -8
//�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a,b;
		
		for(int i=1; i<=t; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Case #" + i +": " + a + " + " + b + " = " + (a+b));
		}
	}
}