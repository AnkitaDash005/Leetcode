import java.util.*;
public class SoldierAndBanana_546A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();

        int sum=0;
        for(int i=1;i<=w;i++){
            sum+=(i*k); // first banana for k, second for 2k and so on..
        }
        if(sum>n){
            System.out.println(sum-n); //how much money needs to be borrowed
        }
        else{
            System.out.println(0);
        }
        
        sc.close();
    }
}
