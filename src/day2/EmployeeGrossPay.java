package day2;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {
        //what we have
        int rate=15;
        int maxHoursPerWeek=40;
        //what we need
        Scanner Scanner=new Scanner(System.in);
        System.out.println("please enter number of working hours");
        int hours=Scanner.nextInt();
        while(hours>maxHoursPerWeek){
            System.out.println("please entre number between1 and  40");
            hours=Scanner.nextInt();
        }
        int salary=hours*rate;
        System.out.println("salary is :"+salary);
        Scanner.close();

    }
}
