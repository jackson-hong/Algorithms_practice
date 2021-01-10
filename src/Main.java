import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #1929
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        boolean[] table = new boolean[end+1];//true = isNotPrime false = isPrime
        table[0] = table[1] = true;
        for(int i = 2; i*i < table.length; i++){
            if(!table[i]){
                for(int j = i*i; j < table.length; j += i){
                    table[j] = true;
                }
            }
        }

        for(int i = start; i < table.length; i++){
            if(!table[i])System.out.println(i);
        }
    }
}
