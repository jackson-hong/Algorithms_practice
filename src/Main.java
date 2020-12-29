import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(sumOfNum(sc.nextInt()));
    }
    // baekjoon #11720
    static int sumOfNum(int num){
        int result = 0;
        sc.nextLine();
        String input = sc.nextLine();

        for(int i = 0; i < num; i++){
            result += Character.getNumericValue(input.charAt(i));
        }

        return result;
    }
}
