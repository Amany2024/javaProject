package day4;

import java.util.Scanner;

public class InstantPayCheck
{
    static Scanner scanner=new Scanner(System.in);
    static final double requiredSalary=20000;
    static final double requiredCreditScore=700;
    public static void main(String[] args)
    {

        double salary=getEmployeeSalary();
        double creditScore=getEmployeeCreditScore();
        boolean qualified=isQualified(salary,creditScore);
        notifyUser(qualified);

        scanner.close();

    }
    static double getEmployeeSalary()
    {
        System.out.println("Enter your salary");
        double salary=scanner.nextDouble();
        return salary;

    }
    static double getEmployeeCreditScore()
    {
        System.out.println("Enter your credit score");
        double creditScore=scanner.nextDouble();
        return creditScore ;

    }

    static boolean isQualified(double salary,double creditScore) {
        if (salary > requiredSalary && creditScore > requiredCreditScore)
        {
            return true;
        }
        else {
            return false;
        }

    }

    static void notifyUser(boolean qualified)
    {
        if (qualified == true)
        {
            System.out.println("Congratulation,you are qualified");
        }
        else
        {
            System.out.println("Sorry,you are not qualified");
        }
    }


}
