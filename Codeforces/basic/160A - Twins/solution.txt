import java.util.*;
public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int mine=0;
        int total=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];

        }
        Arrays.sort(arr);
        int count=0;
        for(int j=n-1;j>=0;j--){
            mine+=arr[j];
            count++;
            if(mine>total-mine){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
