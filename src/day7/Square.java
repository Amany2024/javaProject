package day7;

import day4.Rectangle;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter(){
        double perimter=length*sides;
        return perimter;
    }


}
