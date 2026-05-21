class Alen{
    private int age;
    private String name;
    public void setAge(int n){
        age=n;
    }
    public void SetName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
    Alen obj = new Alen();
    obj.setAge(20);
    obj.SetName("anil");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
