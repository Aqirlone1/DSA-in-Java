public class LevelFirst 
{
    public static void main(String[] args) {
        int n =10;
      
        funBoth(n);
    }

   static void  funBoth(int n){

    if(n==0){
        System.out.println();
        return;
    }
 System.out.print(" "+n); 
 funBoth(n-1);
 System.out.print(" "+n);
}

   
    
}
