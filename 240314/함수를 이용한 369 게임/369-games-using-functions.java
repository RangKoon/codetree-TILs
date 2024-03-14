import java.util.Scanner;
public class Main {
    public static boolean sol1(int a) {
        while(true) {
            if(a%10==3 || a%10==6 || a%10==9)
                return true;
            a/= 10;
            if(a==0)
                break;
        }
        return false; 
    }
    

    public static boolean sol2(int a) {
        return sol1(a) || a%3==0;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++) {
            if(sol2(i))
                cnt ++;
        }
        System.out.println(cnt);
    }
}