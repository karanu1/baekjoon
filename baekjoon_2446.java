import java.util.Scanner;

//baekjoon_2446
/*
*/
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int col=0;
		
		//А­ За
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int j=0; j<(2*n)-1; j+=2)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n-1; j++)
				System.out.print(" ");
			for(int j=1; j<4+col; j++)
				System.out.print("*");
			System.out.println();
			col += 2;
		}
	}
}