import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String part = sc.next();
        int cnt = 0;

        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i)==part.charAt(0) && s.charAt(i+1)==part.charAt(1))
                cnt ++;
        }
        System.out.println(cnt);
    }
}