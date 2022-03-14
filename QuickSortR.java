import java.util.Arrays;

public class QuickSortR{
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[],int low,int hi)
    {
        if(low>=hi){
            return;
        }

        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while(s<=e)
        {
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            while(s<=e){
                int temp=arr[s];
                    arr[s]=arr[e];
                    arr[e]=temp;
                    s++;e--;
            }
        }
        sort(arr,low, e);
        sort(arr,s, hi);


    }

}