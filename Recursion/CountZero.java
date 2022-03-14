public class CountZero {

    public static void main(String[] args) {
        int n=10123400;
       int zeros= countZero(n);
       System.out.println(zeros);
    }
    static int count=0;
    static int countZero(int n)
    {
        if(n==0){
            return 0;
        }
           int rem=n%10;
            if(rem==0){
               count++;
            }
            countZero(n/10);
            return count;
}

}

    

