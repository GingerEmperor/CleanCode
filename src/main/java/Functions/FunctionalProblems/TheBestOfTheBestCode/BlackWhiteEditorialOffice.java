package Functions.FunctionalProblems.TheBestOfTheBestCode;

public class BlackWhiteEditorialOffice extends EditorialOffice {

    @Override
    void addDetailsBeforePrinting() {

    }

    @Override
    Book printBook(String text) {
        System.out.println("Printing text...");
        Book book=new BlackWhiteBook();
        book.write(text);
        return book;
    }

    @Override
    void addDetailsAfterPrinting() {
        drawBlackWhiteIllustrations();
    }

    public void drawBlackWhiteIllustrations(){
        System.out.println("Draw black and white illustrations...");
    }
}
