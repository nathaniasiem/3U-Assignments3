
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //create a graph
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //turn on thing counter labels
        kw.showThingCounts(true);

        //program karel to move
        //create a loop
        //karel moves,picks and puts things for first bar
        for (int i = 0; i < 1; i++) {
            karel.move();
            karel.pickAllThings();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
        }
        //create a loop
        //karel turns around and goes to the next bar
        for (int i = 0; i < 1; i++) {
            karel.turnAround();
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
        //create a loop
        //karel moves,picks and puts things for second bar
        for (int i = 0; i < 1; i++) {
            karel.pickAllThings();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.putThing();
        }
        //create a loop
        //karel turns around and goes to the next bar
        for (int i = 0; i < 1; i++) {
            karel.turnAround();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
        //create a loop
        //karel moves,picks and puts things for third bar
        for (int i = 0; i < 1; i++) {
            karel.pickAllThings();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
        }
        //create a loop
        //karel turns around and goes to the next bar
        for (int i = 0; i < 1; i++) {
            karel.turnAround();
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
        //create a loop
        //karel moves,picks and puts things for the last bar
        for (int i = 0; i < 1; i++) {
            karel.pickAllThings();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
        }
        //create a loop
        //karel turns around and stops
        for (int i = 0; i < 1; i++) {
            karel.turnAround();
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
    }
}
