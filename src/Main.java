import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #1011
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());
        for(int i = 0; i < times; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int goal = Integer.parseInt(st.nextToken());
            int distance = goal - start;
            int idx= 1;

            for(;;idx++){
                if(distance < Math.pow(idx,2)){
                    idx--;
                    break;
                }else if(distance == Math.pow(idx,2)){
                    break;
                }
            }
            System.out.println((int)Math.ceil(2*idx-1 + (distance-Math.pow(idx,2))/idx));
        }
    }
}
