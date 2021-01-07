import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #1193
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        int idx = 0;
        int i;
        int j;
        outerloop:
        for(i = 1; ; i++){
            for(j = 1; j <= i; j++){
                idx++;
                if(idx == input)break outerloop;
            }
        }
        if(i%2==1)System.out.println(""+(i-j+1)+"/"+j);
        else System.out.println(""+j+"/"+(i-j+1));
    }
}
