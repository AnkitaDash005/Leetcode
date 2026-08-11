import java.util.*;
public class Elephant671A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a>0){
            if(a>=5){
                a-=5;
            }
            else if(a==4){
                a-=4;
            }
            else if(a==3){
                a-=3;
            }
            else if(a==2){
                a-=2;
            }
            else{
                a-=1;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
