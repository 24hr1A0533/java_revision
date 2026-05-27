class Ola {
    public void show()throws ArithmeticException
    {
        System.out.println(2/0);
    }
    public  int div(int a, int b)throws ArithmeticException
    {
        return a/b;
    }
}
public class ThrowKeyWord {
    public static void main(String[] args) {
        Ola obj = new Ola();
        try {
            obj.show();
            obj.div(1,0);
        }
        catch (ArithmeticException e){
            System.out.println("something is wrong");
        }
    }
}
