public class PrimeLoop 
{
    public static void main(String[] args) {
        int n=14;
    //    System.out.println(isPrime(n));
        for(int i=0;i<n;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }

    private static boolean isPrime(int i) 
    {
       

        if(i<=1){
           return  false;
        }
        int c=2;
        while(c<=Math.sqrt(i)){
            if(i%c==0){

                return false;
            }
            c++;
        }


        return true;
    }
    
}
