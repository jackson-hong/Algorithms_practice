import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        overAverage(sc.nextInt());
    }
    // baekjoon #4344
    static void overAverage(int num){

        for(int i = 0; i < num; i++){
            int peopleNum = sc.nextInt();
            int[] people = new int[peopleNum];
            int sum = 0;
            int overAverage = 0;
            for(int j = 0; j < peopleNum; j++){
                int input = sc.nextInt();
                sum += input;
                people[j] = input;
            }

            for(int j = 0; j < peopleNum; j++) if(people[j]>sum/peopleNum) overAverage++;
            System.out.printf("%.3f%%", (overAverage/(double)peopleNum)*(Math.pow(10,2)));
            System.out.println();
        }
    }
}
