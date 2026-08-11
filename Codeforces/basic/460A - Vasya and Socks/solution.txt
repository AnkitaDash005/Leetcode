import java.util.*;
public class VasyaAndSocks_460A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// n socks in total 
        int m=sc.nextInt(); //new socks on m multiple days
        int days=1;
        while(n>0){
            n--;
            if(days%m==0){
                n+=1;
            }
            days++;
        }
        System.out.println(days-1);
        sc.close();
    }
}
