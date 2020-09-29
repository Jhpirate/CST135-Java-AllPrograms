package test;

import base.ShapeBase;
import shape.Rectangle;
import shape.Triangle;
import shape.Circle;

public class ShapeBaseClassTester {
    private static void displayArea(ShapeBase shape){
        System.out.println("This is a shape named: " + shape.getName() + " With an area of: " + shape.calculateArea());
    }

    public static void main(String[] args){
        ShapeBase[] shapes = new ShapeBase[3];
        shapes[0] = new Rectangle("Rectangle", 10, 200);
        shapes[1] = new Triangle("Triangle", 10, 50);
        shapes[2] = new Circle("Circle", 5);


        for(int i=0; i < shapes.length; i++){
            displayArea(shapes[i]);
        }
    }
}
