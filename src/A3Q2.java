
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.EAST);

        //create a square wall
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);

        //create loop
        for (int i = 0; i < 8; i++) {
            //move karel around the square
            karel.move();
            karel.move();
            karel.turnRight();
            karel.move();
            karel.move();
            karel.turnRight();
            karel.move();
            karel.move();
            karel.turnRight();
            karel.move();
            karel.move();
            karel.turnRight();
        }
    }
}
