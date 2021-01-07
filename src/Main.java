import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #10250
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());
        for(int i = 0; i < times; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int customer = Integer.parseInt(st.nextToken());
            int idx = 0;
            int j = 0;
            int k = 0;
            outerloop:
            for(j = 1; j <= w; j++){
                for(k = 1; k <= h; k++){
                    idx++;
                    if(idx==customer)break outerloop;
                }
            }
            System.out.printf("%d%02d\n",k,j);
        }
    }
}
