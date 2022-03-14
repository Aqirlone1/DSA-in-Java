import java.util.Arrays;

public class Program{
    public static void main(String[] args) {
        
        int arr[]={5,4,7,8,2};
        System.out.println("orignal Array  "+Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;

        }

        System.out.println("reversed Array "+Arrays.toString(arr));

    }
}