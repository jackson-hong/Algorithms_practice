import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int input = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i = 0; i < input; i++){//인풋을 몇 번 받을
            String str = bf.readLine();
            ArrayList<Character> chList = new ArrayList();
            int idx = 0;
            outerloop:
            for(int j = 0; j < str.length(); j++){ //인풋의 0번째 자리수 부터 확인
                if(j==0){
                    chList.add(str.charAt(j));
                } //0번째 자리인 경우 확인 리스트에 넣음
                else {
                    if(str.charAt(j)!=chList.get(idx)){
                        if(chList.contains(str.charAt(j))){
                            break outerloop;
                        }else {
                            chList.add(str.charAt(j));
                            idx++;
                        }
                    }
                }
                if(j==str.length()-1)result++;
            }
        }
        System.out.println(result);
    }
    // baekjoon #1316
    static void solution(int input){
    }
}
