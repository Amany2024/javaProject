package day4;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1=new Rectangle();
        System.out.println("The counter value is  "+room1.getCounter());
//         room1.setLength(20);
//        room1.setWidth(10);
//       double area1=room1.calculatearea();
//        System.out.println("The area of room 1 is "+area1);
//       double perimeter1 =room1.calculatePerimeter();
//       System.out.println("The perimter of room 1 is "+perimeter1);


        Rectangle room2=new Rectangle(10,20);
        System.out.println("The counter value is  "+room2.getCounter());
//        room2.setLength(10);
//        room2.setWidth(5);
//        double area2=room2.calculatearea();
//        System.out.println("The area of room 2 is "+area2);
//        double perimeter2 =room2.calculatePerimeter();
//        System.out.println("The perimter of room 2 is "+perimeter2);
//
//
//
//        double total=area1+area2;
//        System.out.println("Total area of two rooms is :"+total);


    }
}
