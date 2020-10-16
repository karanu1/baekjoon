import java.util.Scanner;

//baekjoon_10951 A + B - 4
/*
*/
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}