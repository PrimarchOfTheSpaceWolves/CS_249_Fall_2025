package edu.realemj.exercises.introobj;

public class NPC {
    private int health = 100;

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        if(h >= 0) {
            health = h;
        }
        else {
            health = 0;
        }
    }
}
