import java.util.*;
public class Translation_41A {
    public static void ReverseMatch(String s, String t){
        int a=s.length();
        int b=t.length();
        if(a!=b){
            System.out.println("NO");
            return;
        }
        int k=0;
        int l=a-1;
        while(k<a && l>=0){
            if(s.charAt(k)!=t.charAt(l)){
                System.out.println("NO");
                return;
            }
            k++;
            l--;
        }
        System.out.println("YES");
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        ReverseMatch(s, t);
        sc.close();
    }  
}
