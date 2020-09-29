package assignment5;

public abstract class Weapon {

    //methods
    public void fireWeapon(int p_power){
        System.out.println("In Weapon.fireWeapon() with a power of " + p_power);
    }

    public abstract void activate(boolean enable);

}
