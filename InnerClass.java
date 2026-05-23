class X{
    public int age;
    public void show(){
        System.out.println("show");
    }
    class A{
        void z(){
            System.out.println("A");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        X obj=new X();
        X.A obj1 = obj.new A();
        obj1.z();

    }
}
