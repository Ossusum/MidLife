package Logic;

/**
 * Created by Benny on 11/20/2016.
 */
public class Player extends Entity{
    private double attack;
    private int exp;

    public Player(String name) {
        super(name);
    }

    public Player(String name, Part[] bodyParts, boolean isDead, int health) {
        super(name, bodyParts, isDead, health);
    }

    public Player(String name, double attack, int exp) {
        super(name);
        this.attack = attack;
        this.exp = exp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
