public class RevString {
    public static void main(String[] args) {
        String str="enoL riqA";
        int l=str.length()-1;
         reverse(str,l);
           
    }
    static void reverse(String str,int length)
    {
       if(length<0){
           return;
       }
       System.out.print(str.charAt(length));
       --length;
       reverse(str,length);
        
    }
    
}
