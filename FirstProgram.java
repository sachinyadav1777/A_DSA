import java.util.*;
public class FirstProgram {
    public static void merge(int arr[],int lb, int mid, int ub){
        int i = lb;
        int j = mid+1;
        int k = 0;
        int b[] = new int[ub-lb+1];
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
                b[k] = arr[i];
                i++;
                k++;
            }
            else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
            while(i<=mid){
                b[k] = arr[i];
                i++;
                k++;
            }
            while(j<=ub){
                b[k] = arr[j];
                j++;
                k++;
            }
            
            for(k=0; k<b.length; k++){
                arr[lb+k] = b[k];
            }
    }
    public static void mergesort(int arr[],int lb,int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid+1, ub);
            merge(arr, lb, mid, ub);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the Array Element: ");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        mergesort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
