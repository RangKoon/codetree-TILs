import java.util.Scanner;
public class Main {
    public static void minMulti(int n, int m) {
        int min = 1;
        for(int i=2; i<=100; i++) {
            if(n%i==0 && m%i==0) {
                min = i;
            }
        }
        System.out.println(n * (m/min));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        minMulti(n, m);
    }
}