import java.util.Scanner;

//baekjoon_10039
/*
*/
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			if(score[i] <40)
				score[i] = 40;
			sum +=score[i];
		}
		System.out.println(sum/score.length);
	}
}