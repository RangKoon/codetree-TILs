import java.util.Scanner;
public class Main {
    public static boolean isPrime(int a) {
        for(int i=2; i<a; i++) {
            if(a%i==0) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=a; i<=b; i++) {
            if(i<2)
                continue;
            if(isPrime(i)) {
                sum+= i;
            }
        }

        System.out.println(sum);
    }
}