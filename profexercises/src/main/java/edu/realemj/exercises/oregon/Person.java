package edu.realemj.exercises.oregon;

public class Person {
    private String name;
    private boolean alive = true;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean a) {
        alive = a;
    }

    public void unalive() {
        alive = false;
    }

    public String toString() {
        String s = name;
        if(!alive) {
            s += " (deceased)";
        }
        return s;
    }

}
