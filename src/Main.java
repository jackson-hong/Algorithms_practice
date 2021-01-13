import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #3053
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());

        System.out.printf("%.6f \n",Math.PI*input*input);
        System.out.printf("%.6f",(Math.pow(input*2,2))/2);

    }
}
