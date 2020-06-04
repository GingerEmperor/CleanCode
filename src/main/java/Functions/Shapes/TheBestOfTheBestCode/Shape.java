package Functions.Shapes.TheBestOfTheBestCode;

public abstract class Shape {
     String name;
     String color;
     Center center;

    public Shape(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
}
