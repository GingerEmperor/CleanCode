package Functions.FunctionalProblems.TheBestOfTheBestCode;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;


class FairyTaleBestTest {


    @Test
    public void shouldTestPrivateMethodGetNumberOfRows() { /////////=========Reflection=============

        FairyTale.createHeader();
        FairyTale.appendText(new StringBuffer("крассивая принцесса."));
        FairyTale.appendText(new StringBuffer("Приехал принц"));
        FairyTale.appendText(new StringBuffer("И уехал"));
        FairyTale.appendFooter();

        System.out.println(FairyTale.fairyTaleText);
        System.out.println(FairyTale.getNumberOfRows());   //works if getNumberOfRows is public

        assertEquals(5, FairyTale.getNumberOfRows());

//    //  Reflection With Exception
//        try {
//            Method geNumberOfRowsMethod=FairyTale.class.getDeclaredMethod("getNumberOfRows",null);
//            geNumberOfRowsMethod.setAccessible(true);
//            System.out.println("Number of rows: "+ geNumberOfRowsMethod.invoke(FairyTale.class));
//            assertEquals(5,geNumberOfRowsMethod.invoke(FairyTale.class));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}