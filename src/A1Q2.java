
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for robot
        City af = new City();
        // create a robot
        Robot Ram = new Robot(af,1,2,Direction.SOUTH);
        
        // create wall around robot
        new Wall(af,1,1,Direction.NORTH);
        new Wall(af,1,1,Direction.WEST);
        new Wall(af,1,2,Direction.NORTH);
        new Wall(af,1,2,Direction.EAST);
        new Wall(af,1,2,Direction.SOUTH);
        new Wall(af,2,1,Direction.WEST);
        new Wall(af,2,1,Direction.SOUTH);
        
        // create newspaper for robot
        new Thing(af,2,2);
        
        // make robot get the newspaper
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.move();
        Ram.pickThing();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();  
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
                  
        
        
    }
}
