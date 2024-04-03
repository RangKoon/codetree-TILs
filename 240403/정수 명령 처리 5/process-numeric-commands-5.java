import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String str = sc.next();
            if(str.equals("push_back")) {
                int q = sc.nextInt();
                a.add(q);
            }
            else if(str.equals("pop_back")) {
                a.remove(a.size()-1);
            }
            else if(str.equals("size")) {
                System.out.println(a.size());
            }
            else {
                int p = sc.nextInt();
                System.out.println(a.get(p-1));
            }
        }

    }
}