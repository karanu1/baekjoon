import java.util.Scanner;

//baekjoon_2742 기찍 N
//2741번 문제에 역순으로 출력
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