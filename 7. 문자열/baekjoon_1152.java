import java.util.Scanner;

//baekjoon_1152 단어의 개수
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine().trim();
		
		if(st.isEmpty()) 
			System.out.println('0');
		else
			System.out.println(st.split(" ").length);
	}
}