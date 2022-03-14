public class ProductRec
 {
     public static void main(String[] args) {
         int n=6;
       
         System.out.println(factorial(n));
     }
     static int factorial(int n)
     {
         if(n==1){
             return 1;
         }

      return n*factorial(n-1);
        
     

     }
    
}
