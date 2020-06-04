package Functions.Shapes.TheBestOfTheBestCode;

public class Drawer {

    public void drawShape(Shape shapeToDraw){
        System.out.print("I am drawing "+shapeToDraw.color+" "+shapeToDraw.name+
                " with center in x:"+shapeToDraw.center.xCoordinate+
                " and y:"+shapeToDraw.center.yCoordinate);
        addSpecials(shapeToDraw);
    }

    private void addSpecials(Shape shapeToDraw) {
        if(shapeToDraw instanceof Circle){
            addSpecials((Circle)shapeToDraw);
        }else if(shapeToDraw instanceof Square){
            addSpecials((Square)shapeToDraw);
        }
    }

    private void addSpecials(Circle circle){
        System.out.println(" and radius: "+circle.radius);
    }

    private void addSpecials(Square square){
        System.out.println(" and side size: "+square.sideSize);
    }

}
