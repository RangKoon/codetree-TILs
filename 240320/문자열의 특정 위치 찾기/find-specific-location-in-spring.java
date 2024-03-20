import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);
        
        if(s.indexOf(ch)==-1)
            System.out.println("No");
        else
            System.out.println(s.indexOf(ch));

        
    }
}