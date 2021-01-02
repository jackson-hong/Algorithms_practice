import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int firNum = sc.nextInt();
        int secNum = sc.nextInt();
        int oriFir = firNum;
        int oriSec = secNum;
        for(int i = 1; i <= 3; i++){
            if(firNum%10 > secNum%10){
                for(int j = 0; j < 3; j++){
                    System.out.print(oriFir%10);
                    oriFir /= 10;
                }
                break;
            }else if (firNum%10 < secNum%10){
                for(int j = 0; j < 3; j++){
                    System.out.print(oriSec%10);
                    oriSec /= 10;
                }
                break;
            }
            firNum /= 10;
            secNum /= 10;
        }
    }
    // baekjoon #2908
    static void solution(String str){
    }
}
