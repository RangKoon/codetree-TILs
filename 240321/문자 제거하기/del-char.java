import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        while(len>1) {
            int n = sc.nextInt();

            if(n>=len)
                n = len -1;
            
            s = s.substring(0,n) + s.substring(n+1);
            len--;
            
            System.out.println(s);

        }
    }
}