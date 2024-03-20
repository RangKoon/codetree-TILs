import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String part = sc.next();
        int location = -1;

        for(int i=0; i<s.length()-part.length()+1; i++) {
            if(s.substring(i,i+part.length()).equals(part)) {
               location = i;
               break;
            }     
        }
        System.out.println(location);
    }
}