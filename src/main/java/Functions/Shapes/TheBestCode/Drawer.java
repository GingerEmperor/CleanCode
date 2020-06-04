package Functions.Shapes.TheBestCode;

public class Drawer {

    public void drawBlackCircle(Center center ,int radius) {
        Circle circle=new Circle();
        circle.setColor("Black");
        System.out.println("Making black circle with center in x:" + center.xCoordinate +
                " and y: " + center.yCoordinate + " and radius: " + radius);
        //...
    }

    public void drawWhiteCircle(Center center, int radius) {
        Circle circle=new Circle();
        circle.setColor("White");
        System.out.println("Making white circle with center in x:" + center.xCoordinate +
                " and y: " + center.yCoordinate + " and radius: " + radius);
        //...
    }


    // что если мы захотим рисовать разноцветные круги !?
    // public void drawBlueCircle(Center center, int radius)
    // public void drawYellowCircle(Center center, int radius)
    // public void drawRedCircle(Center center, int radius)
    // public void drawPinkCircle(Center center, int radius)
    // public void drawGrayCircle(Center center, int radius)

    //а если хотим довавить квадрат !?
}
