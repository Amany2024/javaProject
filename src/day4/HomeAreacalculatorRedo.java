package day4;

import java.util.Scanner;

public class HomeAreacalculatorRedo {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {
        HomeAreacalculatorRedo calculator=new HomeAreacalculatorRedo();
        Rectangle kitchen =calculator.getDimensions();
        Rectangle bathroom =calculator.getDimensions();
        double total=calculateTotalArea( kitchen,bathroom);
        System.out.println("Total area is : "+total);
        scanner.close();

    }
    public Rectangle getDimensions()
    {

        System.out.println("Enter length of room ");
        double length=scanner.nextDouble();
        System.out.println("Enter width of room");
        double width=scanner.nextDouble();
        Rectangle room=new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;   //method return object
    }
    public static double calculateTotalArea(Rectangle kitchen,Rectangle bathroom)
    {
//        double totalArea=kitchen.calculatearea()+bathroom.calculatearea();
//        return totalArea;
        return kitchen.calculatearea()+bathroom.calculatearea();
    }


}
