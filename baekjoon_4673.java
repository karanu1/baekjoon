import java.util.Scanner;

//baekjoon_4673
public class Main{
	static boolean selfNum(int n) {
		boolean flag = true;
		for(int i=1; i<n; i++) {
			int sum=i;
			int mod=i;
			while(mod != 0) {
				sum += mod % 10;
				mod /= 10;
			}
			if(n == sum) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++)
			if(selfNum(i))
				System.out.println(i);
	}
}