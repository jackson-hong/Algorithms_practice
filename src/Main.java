import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int result = 0;
        char[][] ch = {{},{},{},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'}
                ,{'P','Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}};
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            for(int k = 0; k < ch.length; k++){
                if(ch[k].length!=0){
                    for(int j = 0; j < ch[k].length; j++){
                        if(ch[k][j]==c){
                            result += k;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
    // baekjoon #5622
    static void solution(String str){
    }
    //A = 65

    //65, 66, 67 = 3,
}
