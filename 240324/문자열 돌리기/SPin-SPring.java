import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        System.out.println(s);
        for(int i=0; i<len; i++) {
            System.out.println(s.substring(len-i-1,len) + s.substring(0,len-i-1));
        }
    }
}