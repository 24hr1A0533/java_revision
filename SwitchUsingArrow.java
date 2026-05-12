public class SwitchUsingArrow {
    public static void main(String[]args){
        String season="summer";
        switch (season){
            case "summer" -> System.out.println("wear sunglasses");
            case "winter" -> System.out.println("wear hoodies");
            case "spring" -> System.out.println("flowers are beautiful");
            default -> System.out.println("take bath");
        }
    }
}
