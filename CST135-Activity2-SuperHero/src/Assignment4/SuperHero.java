// Author: Jared Heeringa
// Date: 09/24/2020
// Class: CST135
// Project: Assignment #4
// Other: Main Superclass file

package Assignment4;
import java.util.Random;

public class SuperHero {
    //Initialize variables
    private String name;
    private int health;
    private boolean isDead;

    //No arg constructor (default name and 0 health)
    public SuperHero(){
        this.name = "-- Not Set --";
        this.health = 0;
    }

    //Arg based constructor to set name and health
    public SuperHero(String p_name, int p_health){
        this.name = p_name;
        this.health = p_health;
    }

    public void attack(SuperHero opponent){
        //create random number between 1 and 10
        Random rand = new Random();

        // INFO ABOUT RANDOM BELOW:
        // (10+1) to include 10 in the random bounds
        // find first = get first number in the sequence
        // getAsInt return value as an integer
        int damageValue = rand.ints(1, (10+1)).findFirst().getAsInt();

        if(opponent instanceof Batman){
            damageValue = damageValue + ((Batman) opponent).regenerateHealth();
        }

        opponent.determineHealth(damageValue);
        //%s=string %d=int

        System.out.printf("%s has damage of %d and health of %d\n", opponent.name, damageValue, opponent.health);
    }

    private void determineHealth(int p_damage){

        //if no health, mark as dead
        //else subtract damage from current health
        if(this.health - p_damage <= 0){
            this.health = 0;
            this.isDead = true;
        } else {
            this.health -= p_damage;
            //this.health = this.health - p_damage; //this also works
        }
    }

    //getter method for isDead
    public boolean isDead(){
        return isDead;
    }

}
