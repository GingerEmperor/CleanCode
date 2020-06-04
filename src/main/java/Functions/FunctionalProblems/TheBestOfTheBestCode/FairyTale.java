package Functions.FunctionalProblems.TheBestOfTheBestCode;

public class FairyTale {
    public static  StringBuffer fairyTaleText=new StringBuffer();
    private static int numberOfRows;

    public static int getNumberOfRows(){
        return numberOfRows;
    }  //TODO to make method private and test!!!


    public static void createHeader() {
        fairyTaleText.append("Давным давно, жила была \n");
        numberOfRows++;
    }

    public static void appendText(StringBuffer text) {
        fairyTaleText.append(text+"\n");
        numberOfRows++;
    }



    public static void appendFooter() {
        fairyTaleText.append("Вот и сказочки конец, а кто слушал молодец\n");
        numberOfRows++;
    }

}
