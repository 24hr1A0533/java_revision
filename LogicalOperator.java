public class LogicalOperator {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int x = 133;
        int y = 144;
        System.out.println(a>b&&b>a&&x>y);
        System.out.println(a>b||b>a||x>y);
        System.out.println(!(a==b));
    }
}
