/*
 * Daniel Vasquez
 * ID: 026907762
 * Rushil Prajapati
 * ID: 027485027
 */

import java.lang.InterruptedException;
import java.util.Random;

public class Villager implements Runnable {
    // Random object so each villager comes from a random village
    // Making it private because they both need to cross the same road
    // Name of the villager

    private Random rand;
    private RoadController road;
    String name;

    public Villager(RoadController r, String name) {
        this.road = r;
        this.rand = new Random();
        this.name = name;
    }

    public int sleepTime()
    {
        return(rand.nextInt(3000) + 1000);
    }

    // Crossing the shared road
    public void crossRoad(RoadController road) {
            int sleepTime;
            // We need try catch in case of error
            try {
                // sleep time is between 1 and 3 seconds
                sleepTime = sleepTime();
                // Entering the shared road
                road.enteringRoad();
                System.out.println(this.name + " is traveling on the road. ");
                System.out.println(this.name + " is eating a donut: " + sleepTime / 1000 + "s");
                // If the thread is sleeping then the villager is crossing the road
                Thread.sleep(sleepTime);
                System.out.println(this.name + " has finished exchanging and has left the road");
                // Exiting the road
                road.exitingRoad();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        }
    // run function that is necessary for a class that implements runnable
    public void run() {
        // calling crossRoad function above
        this.crossRoad(this.road);
    }



}