

public class PatternsTrangle {
    public static void main(String[] args) {
        trangle(4,0);
        trangle2(4,0);
    }

    static void trangle(int r,int c){

        if(r==0){
            return ;
        }
        if(c<r)
        {
            System.out.print("* ");
            trangle(r,c+1);
        }
        else{
            System.out.println();
            trangle(r-1,0);
        }
    }
        static void trangle2(int r,int c){

            if(r==0){
                return ;
            }
            if(c<r)
            {
                trangle2(r,c+1);
                System.out.print("* ");
                
            }
            else{
                trangle2(r-1,0);
                System.out.println();
                
            }

        }
    
}
