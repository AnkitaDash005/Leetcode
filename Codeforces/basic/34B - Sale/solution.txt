import java.util.*;

public class sale_34B {
    public static int  sum(int n, int[] arr){
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                k-=arr[i];
            }
    }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            }
        Arrays.sort(arr);
        System.out.println(sum(n,arr));
        sc.close();
    }
}
