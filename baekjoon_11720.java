import java.util.Scanner;

//baekjoon_11720
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(st.substring(i, i+1));
		}
		System.out.println(sum);
	}
}