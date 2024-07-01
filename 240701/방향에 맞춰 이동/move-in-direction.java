import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dx[] = new int[] {-1,0,0,1};
        int dy[] = new int[] {0,-1,1,0};
        int nx = 0;
        int ny = 0;
        
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int j;
            int dist = Integer.parseInt(input[1]);
            if(input[0].equals("W"))
                j = 0;
            else if(input[0].equals("S"))
                j = 1;
            else if(input[0].equals("N"))
                j = 2;
            else 
                j = 3;
            
            nx += dx[j] * dist;
            ny += dy[j] * dist;
        }
        System.out.println(nx + " " + ny);
    }
}