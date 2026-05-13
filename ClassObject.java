class Calc{
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result=obj.add(1,2);
        System.out.println(result);
    }
}
