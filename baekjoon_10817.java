import java.util.Scanner;

//baekjoon_10817
/*
*/
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[3];
		int tmp;
		
		for(int i=0; i<3; i++)
			ar[i] = sc.nextInt();
		
		for(int i=0; i<3; i++) 
			for(int j=i+1; j<3; j++)
				if(ar[i]<ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
		System.out.println(ar[1]);
		
		for(int i=0; i<3; i++) {
			System.out.println(ar[i]+" ");
		}
	}
}