package Assignment4;

public class Superman extends SuperHero {
    public Superman(int p_health){
        super("Superman", p_health);
    }

    protected int doublePunch(int p_damage) {
        return p_damage * 2;
    }
}
