public class AllNos {
   
    public static void main(String[] args) {
        int n=14;
    //    System.out.println(isPrime(n));
        for(int i=2;i<n;i++){
            System.out.println(" "+isPrime(i));
        }
    }

    private static int isPrime(int i) 
    {
       

        if(i<=1){
           return  0;
        }
        int c=2;
        while(c<Math.sqrt(i)){
            if(i%c==0){

           
               
            } 
            c++;
    
        }


       return i;
    }
    
}

    

