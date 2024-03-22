import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int len1 = s1.length();
        int len2 = s2.length();
        boolean bool = true;
        while(bool) {
            bool = false;
            for(int i=0; i<len1-len2; i++) {
                if(s1.substring(i,i+len2).equals(s2)) {
                    bool = true;
                    s1 = s1.substring(0,i) + s1.substring(i+len2);
                    len1 -= len2;
                }  
            }
        }
        System.out.println(s1);
    }
}