import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        long result = 0;
        long base = Long.parseLong(st.nextToken());
        long plus = Long.parseLong(st.nextToken());
        long margin = Long.parseLong(st.nextToken());
        if(plus >= margin){
            System.out.println(-1);
            return;
        }

        result = base/(margin-plus)+1;

        System.out.println(result);
    }
    // baekjoon #1712
}
