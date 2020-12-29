import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(hansoo(sc.nextInt()));
    }
    // baekjoon #1065
    static int hansoo(int num){

        int result = 0;

        for(int i = 1; i <= num; i++){
            if(i<100)result++;
            else {
                int numCount = 0;
                int[] nums = new int[5];
                int temp = i;
                while(temp!=0){
                    nums[numCount] = temp%10;
                    temp /= 10;
                    numCount++;
                }
                int gap = 0;
                for(int j = 0; j < numCount-1; j++){
                    if(j==0)
                        gap = nums[j] - nums[j+1];
                    else {
                        if(gap!=nums[j] - nums[j+1])break;
                        else{
                            if(j==numCount-2){
                                result++;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}
