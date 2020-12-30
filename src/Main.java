import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        wordsStudy(sc.next());
    }
    // baekjoon #1157
    static void wordsStudy(String str){
        Map<Character,Integer> map = new HashMap();
        str = str.toUpperCase();

        for(int i = 0; i < str.length(); i++){
            try {
                char ch = str.charAt(i);
                map.put(ch, 0);
                for(int j = 0; j < str.length(); j++){
                    if(ch==str.charAt(j))map.put(ch,map.get(ch)+1);
                }
                str = str.replaceAll(""+ch,"");
            }catch(IndexOutOfBoundsException e){
                break;
            }
        }
        Iterator it = map.entrySet().iterator();
        int bigNum = 0;
        char bigChar = 'a';
        boolean hasTwoBig = false;
        while(it.hasNext()){
            Map.Entry<Character,Integer> en = (Map.Entry<Character,Integer>)it.next();
            if(en.getValue() > bigNum){
                bigNum = en.getValue();
                bigChar = en.getKey();
            }
        }
        map.remove(bigChar);
        it = map.values().iterator();
        while(it.hasNext()){
            int num = (int)it.next();
            if(bigNum==num){
                System.out.println("?");
                return;
            }
        }
        System.out.println(bigChar);
    }
}
