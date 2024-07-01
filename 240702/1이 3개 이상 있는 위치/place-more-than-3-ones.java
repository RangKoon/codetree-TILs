import java.util.*;
import java.io.*;
public class Main {
    public static boolean bool(int a, int b, int n) {
        return (0<=a && a<n && 0<=b && b<n);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            String input[] = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        int dx[] = new int[] {0,1,0,-1};
        int dy[] = new int[] {1,0,-1,0};
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int num = 0;
                for(int k=0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(bool(nx,ny,n) && arr[nx][ny] == 1) {
                        num ++;
                    }
                }
                if(num >= 3)
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
}