import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(plusCycle(input));
    }
    // baekjoon #1110
    static int plusCycle(int num){
        int result = 0;
        int idx = 0;

         do{
            int input = 0;

            if(idx==0) input = num;
            else input = result;

            result = (input%10) * 10 + (input/10+input%10) % 10;

            idx++;
        }while(result!=num);

        return idx;
    }
}
