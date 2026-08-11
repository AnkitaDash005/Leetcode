import java.util.*;
public class Word_59A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int upp=0;
        int low=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                upp++;
            }
            else{
                low++;
            }
        }
        if(upp>low){
            s=s.toUpperCase();
        }
        else{
            s=s.toLowerCase();
        }
        System.out.println(s);
        sc.close();
    }
}
