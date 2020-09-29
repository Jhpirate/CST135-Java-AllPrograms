package assignment5;

public class Game {
    public static void main(String[] args){
        //create instances of Bomb and Gun class
        Bomb bombWeapon = new Bomb();
        Gun gunWeapon = new Gun();

        //activate both weapons
        bombWeapon.activate(true);
        gunWeapon.activate(true);

        //fire both weapons with no parameters
        bombWeapon.fireWeapon();
        gunWeapon.fireWeapon();

        //fire weapons with set power
        bombWeapon.fireWeapon(12);
        gunWeapon.fireWeapon(7);
    }
}
