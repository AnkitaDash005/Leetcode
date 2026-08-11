import java.util.*;
public class IlyaAndBankAccount_313A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0){
            System.out.println(num);
        }
        else{
            int first=num/10;
            int rem=num%10;
            num=num/100;
            int second=(num*10)+rem;
            if(second>first){
                System.out.println(second);
            }
            else{
                System.out.println(first);
            }

        }
        sc.close();
    }
}