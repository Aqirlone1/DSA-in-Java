import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[]={1,7,5,9,4,7,4,12};
        int target=7;
        System.out.println(search(arr,target,0));
        System.out.println(search1(arr,target,0));
    }

    //secondway but dont use this approach
   static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> search(int []arr,int target,int index)
    {
       
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target){
            list.add(index);
           // return index;
        }
         search(arr,target,index+1);
         return list;
    }


    static ArrayList<Integer> search1(int []arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
       
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target){
            list.add(index);
           // return index;
        }
         ArrayList<Integer> values=search1(arr,target,index+1);

         list.addAll(values);
         return list;
    }
    
}
