package assignment5;

public class Bomb extends Weapon{

    public void fireWeapon(int p_power){
        System.out.println("In Bomb.fireWeapon() with  power of " + p_power);
    }

    public void fireWeapon(){
        System.out.println("In overload Bomb.fireWeapon()");
        super.fireWeapon(10);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("In overridden Bomb.activate() " + enable);
    }
}
