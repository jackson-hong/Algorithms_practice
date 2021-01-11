import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #9020
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 10000;
        boolean[] table =  new boolean[max+1]; //false = isPrime
        table[0] = table[1] = true;
        for(int i = 2; i*i<max+1; i++){
            if(!table[i]){
                for(int j = i*i; j < max+1; j+=i){
                    table[j]=true;
                }
            }
        }
        int times = Integer.parseInt(bf.readLine());
        for(int i = 0; i < times; i++){
            int input = Integer.parseInt(bf.readLine());
            for(int j = input/2; j > 0; j--){
                if(!table[j]&&!table[input-j]){
                    System.out.println(j + " " + (input-j));
                    break;
                }
            }
        }
    }
}
