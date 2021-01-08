import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //baekjoon #2775
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(bf.readLine());
        int[][] nums = new int[15][15];
        for(int j = 0; j < nums.length;j++){
            nums[0][j] = j+1;
        }
        for(int j = 1; j < nums.length; j++){
            for(int k = 0; k < nums[j].length; k++){
                if(k == 0)nums[j][k]=1;
                else {
                    nums[j][k] = nums[j][k-1] + nums[j-1][k];
                }
            }
        }
        for(int i = 0; i < times; i++){
            int h = Integer.parseInt(bf.readLine());
            int w = Integer.parseInt(bf.readLine());
            System.out.println(nums[h][w-1]);
        }
    }
}
