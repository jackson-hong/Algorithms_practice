import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String input = st.nextToken();

        String[] cr = {"dz=","c=","c-","d-","lj","nj","s=","z="};
        int result = 0;
        for(int i = 0; i < cr.length; i++){
            while(input.contains(cr[i])){
                result++;
                input = input.replaceFirst(cr[i]," ");
            }
        }
        input.startsWith("");
        input = input.replaceAll(" ","");
        System.out.println(result+input.length());
    }
    // baekjoon #5622
    // baekjoon #2941
    static void solution(String str){
    }

}
