package edu.realemj.exercises.introobj;

public class Wasteland {
    public static void main(String [] args) {
        System.out.println("I don't want to set the world on fire...");

        NPC bob = new NPC();
        NPC sue = new NPC();

        System.out.println("Bob: " + bob.getHealth());
        System.out.println("Sue: " + sue.getHealth());

        bob.setHealth(-9001);

        System.out.println("Bob: " + bob.getHealth());
        System.out.println("Sue: " + sue.getHealth());



    }
}
