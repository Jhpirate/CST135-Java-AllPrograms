package shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase {
    public Rectangle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public float calculateArea(){
        return width * height;
    }
}
