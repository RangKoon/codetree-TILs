import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c) {
        int arr[] = new int[] {a, b, c};
        int min = 100;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = min(a,b,c);

        System.out.println(answer);

    }
}