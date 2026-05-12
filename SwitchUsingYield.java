public class SwitchUsingYield {
    public static void main(String[] args) {
        String day="monday";
        String result =switch (day){
            case "monday" : yield "7AM";
            case "tuesday" : yield "8AM";
            case "wednesday","thursday" : yield "10AM";
            default: yield "5AM";
        };
        System.out.println(result);
    }
}
