import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean[] nums = new boolean[10000];
        for(int i = 1; i < 10000; i++){
            int num = i;
            int temp = 0;
            while(num < 10000){
                int plus = 0;
                temp = num;
                while(temp > 0){
                    plus += temp%10;
                    temp /= 10;
                }
                num += plus;
                if(num < 10000)nums[num] = true;
            }
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==false)System.out.println(i);
        }
    }
    // baekjoon #4673
    static void selfNumber(){
    }
}
