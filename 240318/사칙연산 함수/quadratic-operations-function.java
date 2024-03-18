import java.util.Scanner;
public class Main {
    public static String Calculator(int a, char b, int c) {
        if(b=='+'){
            return a +" " + b + " " + c + " = " + (a+c); 
        }
        else if(b=='-'){
            return a +" " + b + " " + c + " = " + (a-c); 
        }
        else if(b=='*'){
            return a +" " + b + " " + c + " = " + (a*c); 
        }
        else if(b=='/'){
            return a +" " + b + " " + c + " = " + (a/c); 
        }
        else
            return "False";


        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        System.out.println(Calculator(a,o,c));
    }
}