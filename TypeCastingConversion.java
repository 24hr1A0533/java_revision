public class TypeCastingConversion {
    public static void main(String[] args) {
        //conversion
        byte age=18;
        int age2=age;
        System.out.println(age);
        System.out.println(age2);
        //casting
        float f=1.999f;
        int num=(int)f;
        System.out.println(num);
        // promotion
        byte num1=10;
        byte num2=30;
        int result=num1+num2;
        System.out.println(result);
    }
}
