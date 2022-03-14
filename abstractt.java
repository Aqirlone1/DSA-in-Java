 public class abstractt{
     static int age;

  void show(){
    System.out.println("inside parent");

}
int show(int length ,int age){

    return length*age;
}


}
class text extends abstractt{




    public int abc(int w,int age) {
        return w+age;
}
    @Override
     void show()
    {
        super.show();
        System.out.println("hello override");
    }

}

class Main{
    public static void main(String[] args) {
        abstractt obj=new abstractt();
        obj.show();
        System.out.println(obj.show(40, 10));
        System.out.println(abstractt.age);
         text o=new text();
        System.out.println(o.abc(2, 12));
    }
}