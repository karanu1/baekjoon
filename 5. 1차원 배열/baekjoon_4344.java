import java.util.Scanner;

//baekjoon_4344
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//�׽�Ʈ ���̽� �Է� 
		for(int i=0; i<t; i++) 
		{
			int stuN = sc.nextInt(); //�л� ��
			double aver = 0; //���� ���
			int cnt = 0; //��ճѴ� �л� ��
			double averOver; //��� �Ѵ� ����
			
			int scoAr[] = new int[stuN]; //���� �迭
			for(int j=0; j<stuN; j++)
			{
				scoAr[j] = sc.nextInt(); //���� �Է�
				aver += scoAr[j]; //������ ���Ѵ�.
			}
			aver /= stuN; //�������
			for(int k=0; k<stuN; k++)
			{	//��պ��� ū ������ ������ ī��Ʈ���ش�.
				if(aver < scoAr[k])
					cnt++;
			} //��ճѴ� ��/���л� �� *100���� ����� �Ѵ� ������ ����.
			averOver = (double)cnt / (double)stuN * 100;
		}
	}
}