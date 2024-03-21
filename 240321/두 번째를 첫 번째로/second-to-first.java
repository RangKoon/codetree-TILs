import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char ch[] = s.toCharArray();
        char c1 = ch[0];
        char c2 = ch[1];

        for(int i=0; i<ch.length; i++) {
            if(ch[i] == c2) {

                ch[i] = c1;
             }  
             System.out.print(ch[i]);
      }
        
    }
}