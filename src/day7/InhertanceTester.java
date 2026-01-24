package day7;

import day4.Rectangle;

public class InhertanceTester {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setLength(10);
        System.out.println(rectangle.calculatePerimeter());  //parent
        Square square = new Square();
        square.setLength(10);
        System.out.println(square.calculatePerimeter());  //child
        Women women = new Women();
        Mother mother = new Mother();
        System.out.println(mother.getName());
    }
}
