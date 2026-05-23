class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public void show1(){
        System.out.println("B");
    }
}
class C extends B{
    public void show(){
        System.out.println("C");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj=new B();
        obj.show();
        obj=new C();
        obj.show();
    }
}
