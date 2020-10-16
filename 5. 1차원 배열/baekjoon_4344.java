import java.util.Scanner;

//baekjoon_4344
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//테스트 케이스 입력 
		for(int i=0; i<t; i++) 
		{
			int stuN = sc.nextInt(); //학생 수
			double aver = 0; //점수 평균
			int cnt = 0; //평균넘는 학생 수
			double averOver; //평균 넘는 비율
			
			int scoAr[] = new int[stuN]; //점수 배열
			for(int j=0; j<stuN; j++)
			{
				scoAr[j] = sc.nextInt(); //점수 입력
				aver += scoAr[j]; //점수를 더한다.
			}
			aver /= stuN; //평균점수
			for(int k=0; k<stuN; k++)
			{	//평균보다 큰 점수가 있으면 카운트해준다.
				if(aver < scoAr[k])
					cnt++;
			} //평균넘는 수/총학생 수 *100으로 평균이 넘는 비율을 구함.
			averOver = (double)cnt / (double)stuN * 100;
		}
	}
}