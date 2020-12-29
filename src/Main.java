import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        duplicateString(sc.nextInt());
    }
    // baekjoon #2675
    static void duplicateString(int num){
        sc.nextLine();
        for(int i = 0; i < num; i++){
            //System.out.println("loop start");
            String wholeInput = sc.nextLine();
            int dupCount = Character.getNumericValue(wholeInput.charAt(0));
            //System.out.println("dupCount passed:"+dupCount);
            String input = wholeInput.substring(2,wholeInput.length());
            //System.out.println("input passed:"+input);
            for(int j = 0; j < input.length(); j++){
                for(int k = 0; k < dupCount; k++){
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
