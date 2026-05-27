public class Throw {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c;
        try {
            c=10+10;
            if(c==20){
                throw new ArithmeticException("equal to 20");
            }
        }catch (ArithmeticException e){
            System.out.println("Something went wrong  "+e);
        }
    }

}
