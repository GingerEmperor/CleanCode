package Functions.Shapes.BadCode;

import java.util.ArrayList;
import java.util.List;

public class Drawer {

    //Method that draw circle
    //TODO to draw every shape
    public void draw(int xCoordinate, int yCoordinate, int radius, boolean circleWhiteIfTrueAndCircleBlackIfFalse) {//4 арг это ОЧЕНЬ много
        //Create circle
        Circle circle = new Circle();
        //check if flag is true
        //  then draw White circle

        if (circleWhiteIfTrueAndCircleBlackIfFalse) {
            //set White color
            circle.setColor("White");
            //Draw circle
            System.out.println("Making white circle with center in x: " + xCoordinate +
                    " and y: " + yCoordinate + " and radius: " + radius);
            //....
        } else {
            // if flag is false
            //then draw Black circle
            circle.setColor("Black");
            System.out.println("Making black circle with center in x: " + xCoordinate +
                    " and y: " + yCoordinate + " and radius: " + radius);
            //....

        }

        //не используйте SWITCH
    }
}
