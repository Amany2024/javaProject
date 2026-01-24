package day7;

public class Child extends Parent {
    public void show(int s){       //overloading
        System.out.println("Child int");
    }
    public void show(String s){          //overriding
        System.out.println("Child string");
    }

}
