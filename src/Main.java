import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #1929
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int num = 2;
        if(input==1)return;
        while(input!=1){
            if(input%num==0){
                input /= num;
                list.add(num);
            }else{
                num++;
            }
        }
        for(int i : list){
            System.out.println(i);
        }
    }
}
