import java.util.*;
public class WordCapitalization_281A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[]arr=new String[s.length()];
        arr[0]=(Character.toString(s.charAt(0))).toUpperCase();
        for(int i=1;i<arr.length;i++){
            arr[i]=Character.toString(s.charAt(i));
        }
        System.out.println(String.join("",arr));
        sc.close();

    }
}
