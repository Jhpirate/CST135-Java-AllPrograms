package com.company;

public class FanClassTester {
    public static void main(String[] args){

        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.toPrint();

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.toPrint();

    }
}

class Fan {
    private static final int LOW = 1;
    private static final int MEDIUM = 2;
    private static final int HIGH = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        speed = LOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public void setSpeed(int p_speed){
        speed = p_speed;
    }

    public String getSpeed(){
        String wordSpeed = null;

        if(speed == 1){
            wordSpeed = "LOW";
        } else if (speed == 2){
            wordSpeed = "MEDIUM";
        } else if(speed == 3){
            wordSpeed = "HIGH";
        }
        return wordSpeed;
    }

    public void setState(boolean p_state){
        on = p_state;
    }

    public boolean getState(){
        return on;
    }

    public void setRadius(int p_radius){
        radius = p_radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String p_color){
        color = p_color;
    }

    public void turnOn(){
        on = true;
    }

    public void trunOff(){
        on = false;
    }

    public void toPrint(){
        System.out.println("\n--- START OBJECT DETAILS ---");
        System.out.println("Speed: " + speed);
        System.out.println("Current State: " + on);
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("\n--- END OBJECT DETAILS ---");
    }

}
