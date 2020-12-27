import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("5받음");
        sc.nextLine();
        System.out.println("buffer 흡수");
        for(int i = 0; i < num; i++){
            System.out.print(i + ":");
            String str = sc.next();
            System.out.println(str);
            int sum = 0;
            int temp = 0;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(c=='O'){
                    temp++;
                    sum += temp;
                }else {
                    temp = 0;
                }
            }



            
            System.out.println(sum);
        }
    }
}
