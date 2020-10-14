import java.util.Scanner;

//baekjoon_1316_�׷� �ܾ� üĿ
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int result=0;
		for(int i=0; i<test; i++) {
			String str = sc.next();
			if(wordcheck(str))
				result++;
		}
		System.out.println(result);
    }
	public static boolean wordcheck(String word) {
		boolean check[] = new boolean[26];
		int len = word.length();
		
		for(int i=0; i<len; i++) {
			char tmp = word.charAt(i);
			if(check[tmp-'a']) //�̹� üũ�� ���ĺ�
				return false;
			else {
				if(i<len-1 && tmp != word.charAt(i+1))
					check[tmp-'a'] = true;
			}
		}
		return true;
	}
}