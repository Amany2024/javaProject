package day7;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");

    }
    public void bite()
    {
        System.out.println("I am dog,I bite");
    }
    public void print(String name){  //overloading
        System.out.println("Iam animal print method");
    }
}
