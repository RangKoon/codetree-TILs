import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str[] = new String[n];
        String answer = "";

        for(int i=0; i<n; i++) {
            str[i] = sc.next();
            answer += str[i];
        }

        System.out.println(answer);
    }
}