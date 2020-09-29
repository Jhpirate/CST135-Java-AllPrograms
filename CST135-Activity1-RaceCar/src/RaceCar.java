import java.util.Arrays;

public class RaceCar {
    //declare variables
    Engine raceCarEngine;
    Tire[] raceCarTire;
    String carBody;
    boolean carStarted;

    //default no arg constructor
    RaceCar(){
        this.raceCarEngine = new Engine();
        this.raceCarTire = new Tire[4];

        for(int i=0; i<4; i++){
            raceCarTire[i] = new Tire();
        }

        this.carBody = "-- Not Set --";
        this.carStarted = false;
    }

    //constructor to set body style
    RaceCar(String p_body){
        this.carBody = p_body;
    }

    //start car method
    public void startCar() {

        int okTires = 0;

        //make sure tire pressure is ok in all 4 tires
        for(int i=0; i<4; i++){
            if(raceCarTire[i].validatePressure() == false){
                System.out.println("Tire pressure is too low to start:" + (i+1));
            } else {
                okTires++;
            }
        }

        //if pressureok == true car can start
        if(okTires == 4){
            this.raceCarEngine.startEngine();
        }
    }

    //stop the car
    public void stopCar(){
        this.raceCarEngine.stopEngine();
    }

    //restart the car
    public void restartCar(){
        raceCarEngine.stopEngine();
        raceCarEngine.stopEngine();
    }

    //output all object details
    public void toPrint(){
        System.out.println("--- START OBJECT DETAILS ---");
        System.out.println("RaceCar Engine: " + raceCarEngine.toString());
        for(int i=0; i<4; i++){
            System.out.println("RaceCar Tire: " + (i+1) + " " + raceCarTire[i].toString());
        }
        System.out.println("RaceCar Body: " + carBody);
        System.out.println("RaceCar Status: " + carStarted);
        System.out.println("--- END OBJECT DETAILS ---");
    }
}
