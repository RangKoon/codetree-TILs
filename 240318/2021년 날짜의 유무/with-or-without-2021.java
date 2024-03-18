import java.util.Scanner;

public class Main {
    public static String year(int a, int b) {
        if(0<a && a<13) {
            if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
                if(0<b && b<32)
                    return "Yes";
                else
                    return "No";
            }
            else {
                if(a==2) {
                    if(0<b && b<29)
                        return "Yes";
                    else    
                        return "No";
                }
                else {
                    if(0<b && b<31)
                        return "Yes";
                    else
                        return "No";
                }
            }
        }
        else
            return "No";

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(year(m,d));
    }
}