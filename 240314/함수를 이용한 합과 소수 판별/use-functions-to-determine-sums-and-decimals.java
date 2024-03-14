import java.util.Scanner;
public class Main {
    public static boolean sol1(int n) {
        for(int i=2; i<n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean sol2(int n) {
        return (n%10 + n/100%10 + n/10%10)%2==0 && sol1(n); 
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