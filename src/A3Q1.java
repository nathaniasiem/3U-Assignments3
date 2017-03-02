
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City kw = new City();

        //create new robot
        RobotSE karel = new RobotSE(kw, 2, 0, Direction.EAST);
        //create another robot
        RobotSE merlion = new RobotSE(kw, 4, 0, Direction.EAST);
        //set colour for merlion
        merlion.setColor(Color.blue);

        //place things blocking karel's path
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 5);

        //create a wall for situation 1
        new Wall(kw, 2, 6, Direction.WEST);

        //create another wall for situation 2
        new Wall(kw, 4, 5, Direction.EAST);

        //move karel until reach thing
        while (true) {
            if (!karel.canPickThing()) {
                karel.move();
            }
            if (karel.canPickThing()) {
                break;
            }

        }
        //move merlion until reach a barrier
        while (true) {
            if ((merlion.frontIsClear())) {
                merlion.move();
            }

        }
    }
}