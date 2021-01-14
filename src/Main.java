import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #10872
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        System.out.println(recursion(input));
    }

    public static int recursion(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else {
            System.out.println(""+recursion(n-1)+" " + recursion(n-2));
            return recursion(n-1) + recursion(n-2);
        }
    }
}
