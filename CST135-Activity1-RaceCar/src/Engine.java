public class Engine {
    //declare variables
    private boolean engineStarted;
    private boolean engineStopped;
    private int numOfCylinders;
    private float displacement;

    //no arg constructor
    Engine() {
        engineStarted = false;
        engineStopped = true;
        numOfCylinders = 0;
    }

    //start the engine
    public void startEngine() {
        this.engineStarted = true;
        this.engineStopped = false;
    }

    //stop the engine
    public void stopEngine() {
        this.engineStarted = false;
        this.engineStopped = true;
         System.out.println("Stopped engine");
    }

    //accessor for number of cylinders
    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    //mutator for number of cylinder
    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    //accessor for displacement
    public float getDisplacement() {
        return displacement;
    }

    //mutator for displacement
    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    //override toString method with my own
    @Override
    public String toString() {
        return "Engine{" +
                "engineStarted=" + engineStarted +
                ", engineStopped=" + engineStopped +
                ", numOfCylinders=" + numOfCylinders +
                ", displacement=" + displacement +
                '}';
    }
}
