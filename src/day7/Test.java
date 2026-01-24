package day7;

public class Test {
    public static void main(String[] args) {
        Child child=new Child();  //overloading+polymorphism  ==>  static Binding==compile time polymorphism so call parentMethod
        Parent obj=new Child();
        obj.show("Amany");      //child string
        obj.show(child);           //parent object
        obj.show("monmon");    //overriding +polymorphism ==>  call childMethod   ==> child string
    }

}
// compile Time polymorphism
// ف حال ان ال Method ليها (overriding ,overloading) بيتعمال مع ال overriding وبيستدعي ال childMethod
//ف حاله لو overloading بس وبيستدعي parentMethd