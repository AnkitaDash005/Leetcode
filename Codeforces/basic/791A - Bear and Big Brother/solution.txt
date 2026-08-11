import  java.util.*;
public class BearAndBrother_791A{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(b>=a){
            b*=2;
            a*=3;
            count++;

        }
        System.out.println(count);
        sc.close();
    }
}