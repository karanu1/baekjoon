import java.util.Scanner;

//baekjoon_1065
public class Main{
	static int hanNum(int n) {
		int cnt = 0;
		for(int i=1; i<=n; i++) 
		{
			
			if(i<100) //100아래 두 자리로는 다 한수이다.
				cnt++;
			else if(i<=1000) 
			{
				String st = String.valueOf(i);
				int sub = st.charAt(1) - st.charAt(0);
				int sub2 = st.charAt(2) - st.charAt(1);
				if(sub == sub2)
					cnt++;
			}
		}
		return cnt;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(hanNum(n));
	}
}