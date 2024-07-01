import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nx = 0;
        int ny = 0;
        int dirnum = 3;
        int dx[] = new int[] {1,0,-1,0};
        int dy[] = new int[] {0,-1,0,1};
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'L') {
                dirnum = (dirnum + 3) % 4;
            }
            else if(c == 'R')
                dirnum = (dirnum + 1) % 4;
            else {
                nx += dx[dirnum];
                ny += dy[dirnum];
            } 
        }
        System.out.println(nx + " " + ny);
    }
}