import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char arr[] = s.toCharArray();
        char ch1 = arr[0];
        char ch2 = arr[1];

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==ch1) {
                arr[i] = ch2;
            }
            else if(arr[i]==ch2) {
                arr[i] = ch1;
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}