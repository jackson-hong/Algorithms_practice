import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    //baekjoon #1085
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(bf.readLine(), " ");
        int x = Integer.parseInt(sb.nextToken());
        int y = Integer.parseInt(sb.nextToken());
        int w = Integer.parseInt(sb.nextToken());
        int h = Integer.parseInt(sb.nextToken());

        int distance = 1001;
        if(distance > x) distance = x;
        if(distance > y) distance = y;
        if(distance > w-x) distance = w-x;
        if(distance > h-y) distance = h-y;

        System.out.println(distance);

    }
}
