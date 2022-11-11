
CECS 326: Project #3

This project is intened to use 2 villiges East and West. Where villigers from either side try to cross the road. The objective is to prevent deadlock which would be
them crossing the road at the same time. The demo shows how 5 villigers can cross the road at diffrent times without running into any deadlock. This is achieved in java by using Semaphore locks.

We have a combination of 5 files:

1.) Main.java, - works as is the main file where the code is ran 

2.) Villager.java - where we create the 5 villigers and make them cross the road

3.) Wesr_village.java - where our West Villager is given a road and name upon creation

4.) East_village.java - where our East Villager is given a road and name upon creation

5.)RoadController.java - where the logic for the semephore lock is created  

HOW TO RUN:

Run Main.java: this is the main file so you want to run that file to get the desired output

The output should be a combination of the villigers travling on the road, going an action for a random amount of time, and leaving the road. The indented output will be the villigers being able to cross the roads and exchange without runing into deadlock.
Which in this case would be if a villiger from East and West side tried to cross at the same time.

The output will run until until 5 villigers are created continuslly to show that at no point did the villigers enter deadlock.
