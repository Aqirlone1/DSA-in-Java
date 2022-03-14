public class RevUsingRec {
    public static void main(String[] args) {
        int n=13456;
         reverse(n);
           
    }
    static void reverse(int n)
    {
        if(n==0){
            return;
        }

        int rem=n%10;
        int num=n/10;
        System.out.print(rem);
        reverse(num);

    }
   
}
