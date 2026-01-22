package day3;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter First Number");
            double num1=Scanner.nextDouble();
            System.out.println("Enter Second Number");
            double num2=Scanner.nextDouble();
            double sum=num1+num2;
            System.out.println(sum);
            System.out.println("Do you want to repeat again? ");
            again=Scanner.nextBoolean();
        }while (again==true);
        Scanner.close();     //قفلته برا ال Loop عشان لو حطيته جوا ال loop هيتقفل ومش هيتفتح تاني



    }
}
