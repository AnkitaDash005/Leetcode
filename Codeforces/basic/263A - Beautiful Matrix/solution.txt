import java.util.*;
public class BeautifulMatrix_263A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int [][]arr=new int[5][5];
        int a=-1;
        int b=-1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            arr[i][j]=sc.nextInt();
            if (arr[i][j]==1){
                a=i;
                b=j;
            }
        }   
        }
        int step;
       if(a==2 && b==2){
        step=0;
       }
       else{
        if(a==2 && b!=2){
            step=Math.abs(b-2);
        }
        else if(b==2 && a!=2){
            step=Math.abs(a-2);
        }
        else{
            step=Math.abs(a-2)+Math.abs(b-2);
        }
       }
       System.out.println(step);
       
        sc.close();
    }
}