package Functions.Shapes.MoreBetterCode;

public class Drawer {

    public void drawBlackCircle(int xCoordinate,int yCoordinate,int radius) {//3 aргумента это тожк много
        Circle circle=new Circle();
        circle.setColor("Black");
        System.out.println("Making black circle with center in x:" + xCoordinate +
                " and y: " + yCoordinate + " and radius: " + radius);
        //...
    }

    public void drawWhiteCircle(int xCoordinate,int yCoordinate, int radius) {
        Circle circle=new Circle();
        circle.setColor("White");
        System.out.println("Making white circle with center in x:" + xCoordinate +
                " and y: " + yCoordinate + " and radius: " + radius);
        //...
    }
}
