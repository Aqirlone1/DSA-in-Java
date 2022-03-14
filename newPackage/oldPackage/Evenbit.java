

public class Evenbit {
    public static void main(String[] args) {
       int number=5;
         int position=3;


       int j= 1<<position-1;
       

      int ans= number&j;
      if(ans>0)
      System.out.println(1);
      else 
      System.out.println(0);

    

    }




       
    
}
