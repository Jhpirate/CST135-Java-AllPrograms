public class Tire{
    //declare variables
    private float tirePressure;

    //no arg constructor
    Tire(){
        tirePressure = 34;
    }

    //get tire pressure
    public float getTirePressure() {
        return tirePressure;
    }

    //set tire pressure
    public void setTirePressure(float tirePressure) {
        this.tirePressure = tirePressure;
    }

    //make sure pressure is greater than 32 psi
    public boolean validatePressure(){
        boolean pressureOk = false;

        if(tirePressure > 31){
            pressureOk = true;
        }

        return pressureOk;
    }

    //override toString method with my own
    @Override
    public String toString() {
        return "tirePressure= " + tirePressure;
    }
}