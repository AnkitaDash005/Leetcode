import java.util.*;
public class sum_1742{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        while(n>0){
            int a=Sc.nextInt();
            int b=Sc.nextInt();
            int c=Sc.nextInt();

            if((a+b)==c){
                System.out.println("Yes");
            }
            else if((a+c)==b){
                System.out.println("Yes");
            }
            else if((b+c)==a){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            n--;
        }
        Sc.close();
    }
}