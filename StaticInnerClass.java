class M{
    static class MN{
        public void show(){
            System.out.println("static class ");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        M.MN obj=new M.MN();
        obj.show();
    }
}
