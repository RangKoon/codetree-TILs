import java.util.Scanner;
public class Main {
    public static boolean isYoonneon(int a) {
        if(a%4!=0)  
            return false;
        if(a%100==0 && a%400!=0)
            return false;
        
        return true;

        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.println(isYoonneon(y));
    }
}