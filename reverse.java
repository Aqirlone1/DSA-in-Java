

public class reverse{
    public static void main(String[] args) {
        String reve="aqir lone";
        int n=reve.length()-1;
        String rev="";

        for(int i=n;i>=0;i--){

            rev=rev+reve.charAt(i);
          

            
        }
        System.out.println(rev);
       // System.out.print(Arrays.toString(rev.toCharArray()));
    }
}