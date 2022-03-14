public class AccessModif{

    private int rollNo;
    int age;

public int getrollNo(){
    
    return rollNo;
}
public void setrollNo(int rollNo){
    this.rollNo=rollNo;

}

    

}
class Test{public static void main(String[] args) {
    AccessModif obj =new AccessModif();
     
       obj.setrollNo(19);
       obj.age=20;

       System.out.println("Roll.No is "+obj.getrollNo());
       System.out.println("Age is "+obj.age);
}

   
}