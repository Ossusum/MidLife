package Logic;

import java.util.Arrays;

/**
 * Created by Benny on 11/16/2016.
 */
public class Entity {
    private String name;
    private Part[] bodyParts;
    private boolean isDead;
    private int health;

    public Entity(String name){
        this.name = name;
        this.bodyParts = new Part[]{new Part("Head",10),new Part("Torso",30),new Part("Left Arm",15),new Part("Right Arm",15),new Part("Left Leg",15),new Part("Right Arm",15)};
        this.isDead = false;
        this.health = 1000;
    }

    public Entity(String name, Part[] bodyParts, boolean isDead, int health){
        this.name = name;
        this.bodyParts = bodyParts;
        this.isDead = isDead;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Part[] getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(Part[] bodyParts) {
        this.bodyParts = bodyParts;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    @Override
    public String toString() {
        return "bodyParts:" + Arrays.toString(bodyParts) +
                "\nisDead=" + isDead ;
    }
}
