package Names;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CorrectNamedClass {
    static int n;
    static int p;
    static int countOfPeople;


    public CorrectNamedClass() {
    }

    public int getN(){
        return  n;
    }

    public int showP(){
        return p;
    }

    public int gimmeP(){
        return p;
    }


    public static String dateRightNow = LocalDate.now().toString();

    public static void main(String[] args) {


        int someNumberThatWeNeedToUseInWholeProgram = 0;


        //Try to avoid prefix or postfix of collections
        int[] numbersList = new int[10]; //more better is: numbers ,someNumbers, severalNumbers,...


        //Try to avoid very similar names
        StringBuffer veryLargeAndCoupleVariableThatContainsABCAlphabeticalLetters =
                new StringBuffer(); ///Different only by ...ABC..

        StringBuffer veryLargeAndCoupleVariableThatContainsACDAlphabeticalLetters =
                new StringBuffer();//                    ...ACD..

//      lO
//      10

        long longNumber = 100l;      //l==L    l!=1
        String someString = "100O0OO";// O==o    0!=O
        System.out.println(longNumber);
        System.out.println(someString);

        //Длина имени должна соответствовать размеру его области видимости
        for (int i = 0; i < 5; i++) {
            System.out.println(dateRightNow);
            someNumberThatWeNeedToUseInWholeProgram += i;
        }


        if (someNumberThatWeNeedToUseInWholeProgram < 3) {
            System.out.println("true");
        }


        String helloRus = "Привет";

        String s1 = "eTo";//eng
        String s2 = "еТо";//rus

        System.out.println(s1.equals(s2));


        String eng = "PaBoTa C TeKcToM";
        String rus = "РаВоТа С ТеКсТоМ";

        System.out.println(eng.equals(rus));


        String engNum = "0";
        String rusNum = "0";

        System.out.println(engNum.equals(rusNum));


        numbersList[0] = 5;

//        veryLargeAndCoupleVariableThatContainsABCAlphabeticalLetters.append("ABC");
//        System.out.println(veryLargeAndCoupleVariableThatContainsACDAlphabeticalLetters);

        veryLargeAndCoupleVariableThatContainsABCAlphabeticalLetters.append("ABC");
        System.out.println(veryLargeAndCoupleVariableThatContainsACDAlphabeticalLetters);


    }
}
