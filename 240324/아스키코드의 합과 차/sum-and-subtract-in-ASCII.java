import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        int sub = 0;

        if(ch1>ch2)
            sub = (int)ch1 - (int)ch2;
        else if(ch1<ch2)
            sub = (int)ch2 - (int)ch1;
        
        System.out.println((int)ch1 + (int)ch2 + " " + sub);
    }
}