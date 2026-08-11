import java.util.*;
public class BoyOrGirl_236A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashSet<Character>set=new HashSet<>();
        String text=sc.next();
        for(int i=0;i<text.length();i++){
            set.add(text.charAt(i));
              }
        if((set.size())% 2==0){
            System.out.println( "CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();

    }
}
