interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile,run,deploy..faster");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run,deploy...");
    }
}
class Developer{
    public void devProject(Computer lap){
        lap.code();
    }
}
public class Interface {
    public static void main(String[] args) {
     Developer dev = new Developer();
     Computer lap = new Laptop();
     Computer des = new Desktop();
        dev.devProject(lap);
    }
}
