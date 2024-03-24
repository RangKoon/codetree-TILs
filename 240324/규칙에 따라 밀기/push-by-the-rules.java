import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int len = s1.length();
        char arr[] = s2.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]=='L') {       
                s1 = s1.substring(1,len) + s1.substring(0,1);         
            }
            else if(arr[i]=='R') {
                s1 = s1.substring(len-1,len) + s1.substring(0,len-1);
            }
        }
        System.out.println(s1);
    }
}