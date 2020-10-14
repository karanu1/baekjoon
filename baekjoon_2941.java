import java.util.Scanner;

//baekjoon_2941_크로아니타 알파벳
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String st = sc.nextLine();
		
		for(int i=0; i<str.length; i++) {
			if(st.contains(str[i]))
				st = st.replace(str[i], "!");
		}
        System.out.println(st.length());
    }
}