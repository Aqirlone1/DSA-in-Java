public class DuplicateChar {
    public static void main(String[] args) {
        String str="bcacappled";
        skip("",str,'a');
       
     System.out.println(skipp(str,'a'));
     System.out.println(skipstring(str, "apple"));
        
    }

    private static void skip(String p, String up,char target) 
    {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch==target)
        {
            skip(p,up.substring(1),target);
        }else{
            skip(p+ch, up.substring(1),target);
        }

    }
    //
    private static String skipp( String up,char target) 
    {
        if(up.isEmpty()){
            
            return "";
        }
        char ch=up.charAt(0);
        if(ch==target)
        {
            return skipp(up.substring(1),target);
        }else{
           return ch + skipp( up.substring(1),target);
        }

        

    }
    //skipString
    private static String skipstring( String up,String target) 
    {
        if(up.isEmpty()){
            
            return "";
        }
       
        if(up.startsWith(target))
        {
            
            return skipstring(up.substring(5),target);
           
        }else{
           return up.charAt(0)+ skipstring( up.substring(1),target);
        }

        

    }
    
    


   
}
