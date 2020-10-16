import java.util.Scanner;

//baekjoon_2675
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			//테스트케이스만큼 반복
			int cnt = sc.nextInt();
			String st = sc.next();
			String p = "";
			
			for(int j=0; j<st.length(); j++) {
				for(int k=0; k<cnt; k++) {
					p += st.charAt(j);
				}
			}
			System.out.println(p);		}
	}
}