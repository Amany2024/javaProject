package day4;

public class Rectangle {
    private double length;
    private double width;
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
