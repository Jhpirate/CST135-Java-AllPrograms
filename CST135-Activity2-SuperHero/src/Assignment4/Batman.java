package Assignment4;

public class Batman extends SuperHero {
    public Batman(int p_health){
        super("Batman", p_health);
    }

    protected int regenerateHealth(){
        return 5;
    }
}
