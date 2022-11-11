/**
 * RoadController.java
 *
 *Daniel Vasquez
 *ID:026907762
 *Rushil Prajapati
 *ID:027485027
 */


import java.util.concurrent.Semaphore;
import java.lang.InterruptedException;

public class RoadController
{
    // Creating the Semaphore
    private final Semaphore sem;
    public RoadController() {
        // Setting our semaphore with permit 1 since there is one shared road
        this.sem = new Semaphore(1);
    }
    // Acquires a permit from the semaphore meaning they are entering the road
    public void enteringRoad() throws InterruptedException {
        this.sem.acquire();
    }
    // Release in this case means exiting the road
    public void exitingRoad() {
        this.sem.release();
    }


}
