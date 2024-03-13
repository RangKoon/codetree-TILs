import java.util.Scanner;

public class Main {
    public static void max(int n, int m) {
        int num = 1;
        for(int i=2; i<=100; i++) {
            if(n%i==0 && m%i==0)
                num = i;
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        max(n, m);
    }
}