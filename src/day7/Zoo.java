package day7;
public class Zoo {
    public static void main(String[] args) {
//        Dog dog=new Dog();
//        dog.makeSound();
//        Cat cat=new Cat();
//        cat.makeSound();
//        Animal animal=new Animal();
//
//        Animal animal1=new Dog();       //polymorific object   referenceType=superClass, pointer to supClass
//        animal1.makeSound();
//        ((Dog)animal1).bite();
//
//        Animal animal2=new Cat();
//        ((Cat)animal2).scratch();
//        animal2.makeSound();
//        feed(animal2);
        Animal animal=new Animal();       //overloading+polymorphism  ==>  static Binding==compile time polymorphism so call parentMethod
        animal.print();                   //overriding +polymorphism ==>  call childMethod
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){        //instanceof used to check type of object
            System.out.println("Here is dog food");
        }
        else{
            System.out.println("Here is cat food");
        }
    }
}
