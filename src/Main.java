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
        ArrayList<Integer> primes = new ArrayList<>();
        table[0] = table[1] = true;
        for(int i = 2; i*i<max+1; i++){
            if(!table[i]){
                for(int j = i*i; j < max+1; j+=i){
                    table[j]=true;
                }
            }
        }
        for(int j = 2; j < max+1; j++){
            if(!table[j])primes.add(j);
        }
        int times = Integer.parseInt(bf.readLine());
        for(int i = 0; i < times; i++){
            int input = Integer.parseInt(bf.readLine());
            int[] result = {0,10001};
            outerloop:
            for(int j = 0; primes.get(j) <= input; j++){
                for(int k = 0;  primes.get(k) <= input; k++){
                    int a = primes.get(j);
                    int b = primes.get(k);
                    if(a + b==input&& b-a >= 0 && result[1]-result[0] > b-a){
                        result = new int[]{a, b};
                        break;
                    }
                    if(k==primes.size()-1)break;
                    if(a+b == input && b-a < 0)break outerloop;
                }
                if(j==primes.size()-1)break;
            }
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
