import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #2839
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        int num = 1001;
        int idx = 1;
        while(num!=0){
            if(input%5==0){//5로 나뉘는 경우
                num = input / 5;
                break;
            }else{//5로 나뉘지 않는 경우
                if(input%5==3){//5로 나눈 나머지가 3일 경우
                    num = input / 5;
                    num += 1;
                    break;
                }else {//5로 나눈 나머지가 3이 아닐 경우
                    num = input/5 - idx;
                    if(num<0){
                        num = -1;
                        break;
                    }
                    int rest = input - num*5;
                    idx++;
                    if(rest%3==0){
                        num += rest/3;
                        break;
                    }
                }
            }
            if(num<0){
                num = -1;
                break;
            }
            num = 1001;
        }
        System.out.println(num);
    }
}
