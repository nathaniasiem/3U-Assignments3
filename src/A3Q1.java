
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

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
        // create a new city
        City kw = new City();

        //create new Robot
        RobotSE karel = new RobotSE(kw, 2, 0, Direction.EAST);

        //create a wall
        new Wall(kw, 2, 6, Direction.WEST);

        //place things
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 5);

        //
        while (true) {
            if (!karel.canPickThing()) {
                karel.move();
            }
        }
    }
        //create another situation with new Robot
        //  create new Robot
        RobotSE marie = new RobotSE (kw,4,0,Direction.EAST);
    private City kw;
        //set robot colour
                marie.setColor(Color.pink);
                
}
