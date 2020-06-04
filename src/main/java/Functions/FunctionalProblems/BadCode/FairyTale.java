package Functions.FunctionalProblems.BadCode;

public class FairyTale {
    public static StringBuffer fairyTaleText = new StringBuffer();
    private static int numberOfRows;

    public static int getNumberOfRows() {
        return numberOfRows;
    }


    public static void createHeader(StringBuffer fairyTale) {
        fairyTale.append("Давным давно, жила была \n");
        numberOfRows++;
    }


    public static void appendText(StringBuffer text) {
        fairyTaleText.append(text + "\n");
        numberOfRows++;
    }

    public static void appendFooter(StringBuffer fairyTale) {
        fairyTale.append("Вот и сказочки конец, а кто слушал молодец\n");
        numberOfRows++;
    }


//
//        public static void createHeader() {                         //
//        fairyTaleText.append("Давным давно, жила была \n");         //
//        numberOfRows++;                                             //
//    }                                                               //
//
//
//    public static void appendFooter() {                                       //
//        fairyTaleText.append("Вот и сказочки конец, а кто слушал молодец");   //
//        numberOfRows++;                                                       //
//    }                                                                         //

}
