
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
        // create new city
        City kw = new City();
        
        //create new robot
        RobotSE karel= new RobotSE(kw,2,0,Direction.EAST);
        
        //place things blocking robot
        new Thing(kw,2,4);
        new Thing(kw,2,5);
        
        //create a wall
        new Wall(kw,2,6,Direction.WEST);
        
        //move robot until reach thing
        while(true){
        if(!(karel.canPickThing())){
            karel.move();
        }
        
    }
}
}