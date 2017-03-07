
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City kw = new City();

        //create new robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //build the room enclosing karel
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        //place litter around the room
        new Thing(kw, 3, 4);
        new Thing(kw, 2, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 1);

        //create loop to move karel around the room
        while (true) {
            karel.move();

            if (karel.getAvenue() == 4 && karel.getStreet() == 3) {
                karel.pickThing();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                break;
            }
            if (!(karel.frontIsClear()) && karel.isFacingEast()) {
                karel.turnRight();
                karel.move();
                karel.turnRight();
            }
            //ask karel if front is not clear
            if (!(karel.frontIsClear())) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }
            // if there are things
            //pick them all up
            if (karel.canPickThing()) {
                karel.pickThing();
            }
        }
        while(true){
            karel.move();
            if(!(karel.frontIsClear()) && karel.isFacingWest()){
                karel.turnRight();
                karel.move();
                karel.turnRight();
                break;
            }
        }
    }
}