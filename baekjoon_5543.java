import java.util.Scanner;

//baekjoon_5543
/*
*/
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int sd, jd, hd;
		int coke, soda;
		sd = sc.nextInt();
		jd = sc.nextInt();
		hd = sc.nextInt();
		coke = sc.nextInt();
		soda = sc.nextInt();
		
		int set = sd < jd ? sd : jd;
		set = set < hd ? set : hd;
		set += coke < soda ? coke : soda;
		
		System.out.println(set-50);
	}
}