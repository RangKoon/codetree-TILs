import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean eebool = false;
        boolean abbool = false;

        for(int i=0; i<20; i++) {
            if(str.contains("ee"))
                eebool = true;
            if(str.contains("ab"))
                abbool = true;
        }
        if(eebool)
            System.out.print("Yes ");
        else
            System.out.print("No ");
        
        if(abbool)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}