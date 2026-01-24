package day4;

public class Rectangle {
    protected double length;
    protected double width;
    protected int sides=4;
    private static int counter;

    public int getCounter() {
        return counter;
    }

    public Rectangle(){                                            //the same name of the class
        System.out.println("Iam default constructor");           //default constructor  , always public, runs in the begin of life cycle,can not be called more than one time
        length=0;
        width=0;
        counter++;
    }
    public Rectangle(double length,double width){
        System.out.println("Iam parameterized constructor ");
        this.length=length;
        this.width=width;
        counter++;
    }
                                                //Note : 1- make fields private
                                                //       2- make methods public

    //setters
    public void setLength(double length)
    {
        if(length<0)
        {
            System.out.println("Invalid length");
        }
        else
        {
            this.length=length;
        }
    }
    public void setWidth(double width )
    {
        if(width<0)
        {
            System.out.println("Invalid width");
        }
        else
        {
            this.width = width;
        }
    }

    //getters
    public double getLength(){
        return this .length;
    }
    public double getWidth(){
        return this.width;
    }


    public double calculatearea(){
        //double area=length*width;
        //return area;
        return length*width;
    }
    public double calculatePerimeter(){
        double perimter=length*2+width*2;
        return perimter;
    }

}
