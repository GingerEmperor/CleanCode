package Functions.FunctionalProblems.TheBestOfTheBestCode;

public class ColorEditorialOffice extends EditorialOffice{


    @Override
    void addDetailsBeforePrinting() {
        mixPaints();
    }

    @Override
    Book printBook(String text) {
        System.out.println("Printing text... ");
        Book book=new ColorBook();
        book.write(text);
        return book;
    }

    @Override
    void addDetailsAfterPrinting() {
        drawColorPictures();
    }

    private void mixPaints(){
        System.out.println("Mix paints for pictures...");
    }

    private void drawColorPictures(){
        System.out.println("Drawing colorful pictures...");
    }

}
