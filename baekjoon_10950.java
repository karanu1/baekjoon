import java.util.Scanner;
//백준 10950번 A+B - 3
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 작성
public class Main{
	public static void main(String[] args) {
		int T; //테스트 케이스
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //테스트 개수 입력
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