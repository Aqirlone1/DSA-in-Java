public class Palandrome {
    
    
    public static void main(String[] args) {
        int n=123321;
        System.out.println(palandrome(n));
    }

    static boolean palandrome(int n)
    {

       return n==rev(n);
      
    }
    static int  sum=0;
    static int  rev(int n)
    {
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
        return sum;
    }
}
