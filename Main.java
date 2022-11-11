/*
 * Daniel Vasquez
 * ID: 026907762
 * Rushil Prajapati
 * ID: 027485027
 */

import java.lang.Thread;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        RoadController road = new RoadController();
        Random rand = new Random();

        //Creating 5 villagers to put in random villages ;
        for (int i = 0; i < 5; i++) {
            // Creating instance of a villager
            Villager villager;
            // Creating a random number
            int randNum = rand.nextInt(10);

            // Assigning villagers to their village
            // When even villager goes to West if odd the villager goes to East
            if (randNum % 2 == 0) {
                villager = new West_village(road, "East Villager #" + (i + 1) + ":");
            } else {
                villager = new East_village(road, "West Villager #" + (i + 1) + ":");
            }
            // Villager trys to cross road
            crossingRoad(villager);
        }
    }
    // Creating a new thread for when the villager is crossing
    private static void crossingRoad(Villager villager) {
        new Thread(villager).start();
    }
}