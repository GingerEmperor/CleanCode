package Functions.Shapes.TheBestOfTheBestCode;

public class FunctionTestDrive {
    public static void main(String[] args) {

        Center center=new Center(2,5);

        Circle circle=new Circle(12);
        circle.setCenter(center);
        circle.setColor("Blue");

        Drawer drawer=new Drawer();
        drawer.drawShape(circle);

        Shape square =new Square(6);
        square.setColor("Yellow");
        square.setCenter(center);

        drawer.drawShape(square);

    }
}
