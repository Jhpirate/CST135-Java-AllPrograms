package base;

public class ShapeBase implements ShapeInterface{
    //Initialize variables
    protected String name;
    protected int width, height;
    protected int radius;

    //default constructor
    public ShapeBase(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public ShapeBase(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public float calculateArea(){
        return -1;
    }

}
