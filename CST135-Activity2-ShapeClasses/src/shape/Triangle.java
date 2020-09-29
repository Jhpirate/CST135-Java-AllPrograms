package shape;

import base.ShapeBase;

public class Triangle extends ShapeBase {

    public Triangle(String name, int width, int height) {
        super(name, width, height);
    }


    @Override
    public float calculateArea(){
        return (width * height) / 2;
    }
}
