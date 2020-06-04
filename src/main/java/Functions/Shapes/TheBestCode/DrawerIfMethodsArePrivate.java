package Functions.Shapes.TheBestCode;

public class DrawerIfMethodsArePrivate {
    public void checkColorAndDrawCircle(Center center, int radius, boolean circleWhiteIfTrueAndCircleBlackIfFalse) {
        Circle circle = new Circle();
        if (circleWhiteIfTrueAndCircleBlackIfFalse) {
            drawWhiteCircle(center, radius);
        } else {
            drawBlackCircle(center, radius);
        }
    }


    private void drawBlackCircle(Center center, int radius) {
        Circle circle = new Circle();
        circle.setColor("Black");
        System.out.println("Making black circle with center in x:" + center.xCoordinate +
                " and y: " + center.yCoordinate + " and radius: " + radius);
        //...
    }

    private void drawWhiteCircle(Center center, int radius) {
        Circle circle = new Circle();
        System.out.println("Making white circle with center in x:" + center.xCoordinate +
                " and y: " + center.yCoordinate + " and radius: " + radius);
        //...
    }
}
