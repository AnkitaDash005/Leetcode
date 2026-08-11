import java.util.*;
public class HelpfulMaths_339A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[]arr=s.split("\\+");
        Arrays.sort(arr);
        System.out.println(String.join("+",arr));
        sc.close();

    }
}
