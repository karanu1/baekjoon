import java.util.Scanner;

//baekjoon_2741 N 찍기
//1줄 부터 N줄까지 차례대로 숫자 출력
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}