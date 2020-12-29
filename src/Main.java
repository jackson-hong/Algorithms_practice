import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        searchAlphabet(sc.next());
    }
    // baekjoon #10809
    static void searchAlphabet(String str){

        for(int i = 97; i < 123; i++){
            CharSequence chaa = ""+(char)i;
            if(str.contains(chaa))System.out.print(str.indexOf(i)+" ");
            else System.out.print(-1 + " ");
        }
    }
}
