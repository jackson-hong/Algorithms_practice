import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        expressionOfNum(sc.nextInt());
    }
    // programmers expressionOfNum
    static void expressionOfNum(int n){
        int result = 0;
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }
        int gap = 1;
        for(int i = n-1; i >= 0; i--){//length
            int sum = 0;
            for(int j = i; j >= 0; j--){//start
                sum = nums[j];
                for(int l = 1; l < gap; l++) sum += nums[j + l];
                System.out.println(sum + " gap : "+ gap);
                if(sum==n){
                    result++;
                    break;
                }
            }
            gap++;
            if(gap>n/2)break;
        }
        System.out.println(result);
    }
    //1 - 15 up : 1 gap : 1 length : 15
    //1,2 - 2,3 - 3,4 - .. 14,15 up : 1 gap : 2  length: 14
    //1,2,3 - 2,3,4 - 3,4,5 - .. 13,14,15 up : 1 gap : 3 length : 13
}
