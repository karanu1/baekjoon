import java.util.Scanner;
//���� 10950�� A+B - 3
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷� �ۼ�
public class Main{
	public static void main(String[] args) {
		int T; //�׽�Ʈ ���̽�
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //�׽�Ʈ ���� �Է�
		int ar[] = new int[T];
		for(int i=0; i<T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			ar[i] = a+b;
		}
		for(int i=0; i<T; i++) {
			System.out.println(ar[i]);
		}
	}
}