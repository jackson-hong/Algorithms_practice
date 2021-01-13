import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #1002
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());

        for(int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int[] joe = new int[3];
            int[] lee = new int[3];
            joe[0] = Integer.parseInt(st.nextToken());
            joe[1] = Integer.parseInt(st.nextToken());
            joe[2] = Integer.parseInt(st.nextToken());
            lee[0] = Integer.parseInt(st.nextToken());
            lee[1] = Integer.parseInt(st.nextToken());
            lee[2] = Integer.parseInt(st.nextToken());
            int bigR = 0;
            int smallR = 0;
            if(lee[2]>joe[2]){
                bigR = lee[2];
                smallR = joe[2];
            }else {
                bigR = joe[2];
                smallR = lee[2];
            }
            double distance = Math.sqrt(Math.pow(joe[0]-lee[0],2)+Math.pow(joe[1]-lee[1],2));

            if(distance==0){
                if(lee[2]==joe[2]) {
                    System.out.println(-1);
                    continue;
                }else{
                    System.out.println(0);
                    continue;
                }
            }

            if(bigR > distance){
                if(bigR - smallR < distance)System.out.println(2);
                else if(bigR - smallR == distance)System.out.println(1);
                else System.out.println(0);
            }else {
                if(bigR + smallR > distance)System.out.println(2);
                else if(bigR + smallR == distance)System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}
