
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #1085
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int[] list = new int[3];
        list[0] = Integer.parseInt(st.nextToken());
        list[1] = Integer.parseInt(st.nextToken());
        list[2] = Integer.parseInt(st.nextToken());
        while(list[0]!=0&&list[1]!=0&&list[2]!=0){
            list = Arrays.stream(list).sorted().toArray();
            if(list[2]*list[2] == list[0]*list[0] + list[1]*list[1])System.out.println("right");
            else System.out.println("wrong");

            StringTokenizer bb = new StringTokenizer(bf.readLine()," ");
            list[0] = Integer.parseInt(bb.nextToken());
            list[1] = Integer.parseInt(bb.nextToken());
            list[2] = Integer.parseInt(bb.nextToken());
        }
    }
}
