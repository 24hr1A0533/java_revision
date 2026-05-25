public class TryCatch {
    public static void main(String[] args) {
        int a=0;
        int b=12;
        int c;
        try {
            c=b/a;
            }
        catch (Exception e) {
            System.out.println("some thing is wrong"+e);
        }
        System.out.println(b);
        System.out.println("bye");
    }
}
