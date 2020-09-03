import java.util.Scanner;

//baekjoon_11022 A+B -8
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다
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