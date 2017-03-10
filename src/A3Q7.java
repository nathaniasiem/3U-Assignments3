
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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //create set of 4 squares
        //SQUARE 1
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        //SQUARE 2
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        //SQUARE 3
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        //SQUARE 4
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);

        //program karel to move around the set of squares
        //create a loop
        while (true) {
            //karel moves around square 4
            for (int i = 0; i < 4; i++) {
                karel.move();
                karel.move();
                karel.move();
                karel.turnLeft();
            }
            //karel moves around square 3
            for (int i = 0; i < 4; i++) {
                karel.move();
                karel.move();
                karel.move();
                karel.turnRight();
            }
            //karel moves around square 2
            for (int i = 0; i < 4; i++) {
                karel.turnLeft();
                karel.move();
                karel.move();
                karel.move();
            }
            //karel moves around square 1
            for (int i = 0; i < 4; i++) {
                karel.turnRight();
                karel.move();
                karel.move();
                karel.move();
            }
            //if karel is back at the starting point (3,3), he stops
            if (karel.getAvenue() == 3 && karel.getStreet() == 3) {
                break;
            }
        }
    }
}