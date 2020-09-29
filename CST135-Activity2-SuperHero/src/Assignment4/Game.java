package Assignment4;
import java.util.Random;

//Main file for testing the classes
public class Game {
    public static void main(String[] args){
        //generate random health for each person 1-1000
        Random rand = new Random();

        int supermanHealth = rand.ints(1,(1000+1)).findFirst().getAsInt();
        int batmanHealth = rand.ints(1,(1000+1)).findFirst().getAsInt();

        //setup instances of out superheros
        System.out.println("---- SETTING UP OUR SUPERHEROS ----");
        Superman superman1 = new Superman(supermanHealth);
        Batman batman = new Batman(batmanHealth);
        System.out.println("---- SUPERHERO SETUP COMPLETE ----");

        //print initial health value of each player
        System.out.println("\nSuperman Starting Health: " + supermanHealth);
        System.out.println("Batman Starting Health: " + batmanHealth + "\n");

        //loop to make sure no one is dead
        while(!superman1.isDead() && !batman.isDead()){
            superman1.attack(batman);
            batman.attack(superman1);

            //check if superman is dead after attacks
            if(superman1.isDead()){
                System.out.println("Superman is dead. Batman is the winner!");
            }

            //check if batman is dead after attacks
            if(batman.isDead()){
                System.out.println("Batman is dead. Superman is the winner!");
            }
        }


    }
}
