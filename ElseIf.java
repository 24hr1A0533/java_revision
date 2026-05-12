public class ElseIf {
    public static void main(String[] args) {
        int a = 12;
        int b = 19;
        int c = 14;
        if(a>b && a>c){
            System.out.println("a is grater among 3");
        }
        else if (b>c){
            System.out.println("b is grater among 3");
        }
        else{
            System.out.println("c is grater among 3");
        }
    }
}
