import java.util.Scanner;

//baekjoon_15596
public class Main{ //코드 제출시 클래스 명 Test로 해야함.
	static long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++)
			ans += a[i];
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		
		for(int i=0; i<ar.length; i++)
			ar[i] = sc.nextInt();
		System.out.println(sum(ar));
	}
}