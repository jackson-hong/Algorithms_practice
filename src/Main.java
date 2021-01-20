import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #2447
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int input = Integer.parseInt(bf.readLine());
//        System.out.println(recursion(input));
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,1);
        for(int i :  list) {
            System.out.println(i);
        }
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
