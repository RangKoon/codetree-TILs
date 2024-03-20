import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int eecnt = 0;
        int ebcnt = 0;

        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i)=='e' && s.charAt(i+1)=='e')
                eecnt ++;
             if(s.charAt(i)=='e' && s.charAt(i+1)=='b')
                ebcnt ++; 
        }

        System.out.println(eecnt + " " + ebcnt);
    }
}