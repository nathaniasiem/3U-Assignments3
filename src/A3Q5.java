
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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 2, 2, Direction.EAST);

        //create a pile of things for karel
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);

        //turn on thing labels
        kw.showThingCounts(true);

        //program karel to move
        while (true) {
            if (karel.getStreet() == 2 && karel.getAvenue() == 2 && karel.canPickThing()) {
                karel.pickThing();
            }
            karel.move();
            if (karel.getStreet() == 2 && karel.getAvenue() == 5) {
                karel.putThing();
                karel.turnAround();
            }
            if (karel.getStreet() == 2 && karel.getAvenue() == 2) {
                karel.turnAround();
            }
            
            }
        }
    }
