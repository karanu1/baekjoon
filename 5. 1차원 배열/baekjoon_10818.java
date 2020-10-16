import java.util.Scanner;

//baekjoon_10818
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		int min, max;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
			if(min > ar[i])
				min = ar[i];
			else if(max < ar[i])
				max = ar[i];
		}
		System.out.println(min + " " + max); 
	}
}