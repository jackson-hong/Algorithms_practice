import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        solution(sc.nextInt());
    }
    // programmers findPrimeNum
    static int solution(int n){
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        if(n > 2) {
            for (int i = 3; i <= n; i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (i % list.get(j) != 0) {
                        if (j == list.size() - 1) {
                            list.add(i);
                            break;
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        return list.size();
    }

}
