import java.sql.SQLOutput;
import java.util.Scanner;

class Solution {
Scanner data=new Scanner(System.in);
   public void HelloWorld() {
       System.out.println("Hello World");
    }

    public void Calculator(){
        System.out.println("Enter a number: ");
        int num1=data.nextInt();
        System.out.println("Enter a number: ");
        int num2=data.nextInt();
        System.out.println("Enter a operation + or - or * or /");
        char operation=data.next().charAt(0);
        switch (operation){
            case '+': System.out.println(num1+num2); break;
            case '-' : System.out.println(num1-num2); break;
            case '*' : System.out.println(num1*num2); break;
            case '/' :  System.out.println(num1/num2); break;
            default :
                System.out.println("Invalid operation");
        }
    }

    public void EvenCheck(){
        System.out.println("Enter a number to check even or not :");
        int num1=data.nextInt();
        if(num1%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is not even");
        }
    }
    public void OddCheck(){
        System.out.println("Enter a number to check odd or not :");
        int num1=data.nextInt();
        if(num1%2!=0){
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is not odd");
        }
    }

    public void primeCheck(){
        System.out.println("Enter a number to check prime or not :");
        int num1=data.nextInt();
        boolean prime=true;
        for(int i=2;i<num1-1;i++){
            if(num1%i==0){
                prime=false;
                break;
            }
        }
        if (prime) System.out.println("The number is prime");
        else System.out.println("The number is not prime");
    }


}
public class AllBasicsProblems {
    public static void main(String[] args) {
    Solution obj=new Solution();
    System.out.println("THIS IS HELLO WORLD");
    obj.HelloWorld();
    System.out.println("THIS IS CALCULATOR");
    obj.Calculator();
    System.out.println("THIS IS EVEN CHECK");
    obj.EvenCheck();
    System.out.println("THIS IS ODD CHECK");
    obj.OddCheck();
        System.out.println("THIS IS PRIME CHECK");
    obj.primeCheck();
    }
}
