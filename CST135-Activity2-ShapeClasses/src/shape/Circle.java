package shape;

import base.ShapeBase;

public class Circle extends ShapeBase {
    public Circle(String name, int radius) {
        super(name, radius);
    }

    @Override
    public float calculateArea(){
        return (float) (Math.PI * Math.pow(radius,2));
    }


}
