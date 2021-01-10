import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #1978
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());
        boolean[] table = new boolean[1001];
        table[2] = true;
        for(int i = 2; i < table.length; i++){
            for(int j = 2; j < i; j++){
                if(i%j==0)break;
                if(j==i-1)table[i]=true;
            }
        }
        int result = 0;
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for(int i = 0; i < times; i++){
            int input = Integer.parseInt(st.nextToken());
            if(table[input])result++;
        }
        System.out.println(result);
    }
}
