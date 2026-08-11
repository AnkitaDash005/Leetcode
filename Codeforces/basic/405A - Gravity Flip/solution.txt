import java.util.*;
public class GravityFlip_405A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            if (j> 0) System.out.print(" ");
            System.out.print(arr[j]);
        }
        sc.close();
    }
}

