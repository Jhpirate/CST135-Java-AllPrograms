package assignment5;

public class Gun extends Weapon{

    public void fireWeapon(int p_power){
        System.out.println("In Gun.fireWeapon() with  power of " + p_power);
    }

    public void fireWeapon(){
        System.out.println("In overload Gun.fireWeapon()");
        super.fireWeapon(10);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("In overridden Gun.activate() " + enable);
    }
}
