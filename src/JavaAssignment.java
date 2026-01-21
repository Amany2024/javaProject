import java.util.Scanner;

public class JavaAssignment {
    public static void main(String[] args){

        //1.Arithmetic operations
        Scanner Scanner=new Scanner(System.in);
        int num1=Scanner.nextInt();
        int num2=Scanner.nextInt();

        //1.Arithmetic operations
        System.out.println("Sum of num1 and num2 is "+(num1+num2));
        System.out.println("Difference of num1 and num2 is "+(num1-num2));
        System.out.println("Product of num1 and num2 is "+(num1*num2));
        System.out.println("Reminder of num1 and num2 is "+(num1%num2));


        //2.If conditions
        if(num1>num2){
            System.out.println("The largest number is "+(num1));
        }
        else if(num1<num2){
            System.out.println("The largest number is"+(num2));
        }
        else{
            System.out.println("two numbers are equal");
        }


        //3.Logical operators
        if(num1>0&&num2>0){
            System.out.println("Both numbers are positive");
        }
        else if(num1>0||num2>0){
            System.out.println("One number is positive");
        }
        else{
            System.out.println("No Positives");
        }


        //4.Ternary operator
        System.out.println (num1 > num2 ? "num1 is greater" : "num2 is greater");
        System.out.println (num1 % 2==0? "num1 is even": "num2 is odd");




    }
}
