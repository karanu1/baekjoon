import java.util.Scanner;
 
//baekjoon_10952 A + B - 5
/*
*/
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.println(a+b);
        }
    }
}
