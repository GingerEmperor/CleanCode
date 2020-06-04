package Functions.Shapes.TheBestCode;

public class FunctionsTestDrive {
    public static void main(String[] args) {

        final boolean IS_WHITE =true;
        Center center=new Center(2,5);

        Drawer drawer=new Drawer();
        if(IS_WHITE) {
            drawer.drawWhiteCircle(center,10);
        }
        else {
            drawer.drawBlackCircle(center,10);
        }



//
//        DrawerIfMethodsArePrivate drawerIfMethodsArePrivate=new DrawerIfMethodsArePrivate();
//        drawerIfMethodsArePrivate.checkColorAndDrawCircle(center,10,IS_WHITE);
    }
}
