import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int q = sc.nextInt();

        for(int i=0; i<q; i++) {
            char q1 = sc.next().charAt(0);
            if(q1 == '1') {
                s = s.substring(1,len) + s.substring(0,1);
                System.out.println(s);
            }
            else if(q1 == '2') {
                s = s.substring(len-1,len) + s.substring(0,len-1);
                System.out.println(s);
            }
            else {
                StringBuffer sb = new StringBuffer(s);
                s = sb.reverse().toString();
                System.out.println(s);
            }
        }

    }
}