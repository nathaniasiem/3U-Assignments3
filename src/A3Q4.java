
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 3, 2, Direction.SOUTH);

        //build a room for karel
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);

        //program karel to find exit
        while (true) {
            if (karel.frontIsClear()) {
                karel.move();
            } else {
                karel.turnAround();
            }
            if (karel.getStreet() == 1 && karel.getAvenue() == 2) {
                break;
            }
        }
        //create another program for situation 2
        //create another robot
        RobotSE nia = new RobotSE(kw,6,1,Direction.EAST);
        nia.setColor(Color.blue);
        
        //build a room for nia
        new Wall(kw,6,1,Direction.NORTH);
        new Wall(kw,6,2,Direction.NORTH);
        new Wall(kw,6,3,Direction.NORTH);
        new Wall(kw,6,1,Direction.WEST);
        new Wall(kw,7,1,Direction.WEST);
        new Wall(kw,8,1,Direction.WEST);
        new Wall(kw,8,1,Direction.SOUTH);
        new Wall(kw,8,2,Direction.SOUTH);
        new Wall(kw,8,3,Direction.SOUTH);
        
        
        
        
        
        
    }
}