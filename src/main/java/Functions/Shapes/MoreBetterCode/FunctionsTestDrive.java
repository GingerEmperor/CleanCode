package Functions.Shapes.MoreBetterCode;

public class FunctionsTestDrive {
    public static void main(String[] args) {
        final boolean IS_WHITE =false;
        Drawer drawer=new Drawer();

        if(IS_WHITE)
            drawer.drawWhiteCircle(2,5,10);
        else
            drawer.drawBlackCircle(2,5,10);
    }
}
