package Functions.FunctionalProblems.TheBestOfTheBestCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorialOfficeBestTest {

    @Test
    public void colorEditorialOfficeShouldCreateColorBook(){
        FairyTale.createHeader();
        FairyTale.appendText(new StringBuffer("крассивая принцесса."));
        FairyTale.appendText(new StringBuffer("Приехал принц"));
        FairyTale.appendText(new StringBuffer("И уехал"));
        FairyTale.appendFooter();

        EditorialOffice editorialOffice=new ColorEditorialOffice();
        Book book=editorialOffice.publishBooksWithText(FairyTale.fairyTaleText.toString());
        System.out.println(book.kindOfBook);

        assertEquals("Color book",book.kindOfBook);

        System.out.println(book.read());
    }

    @Test
    public void BlackWhiteEditorialOfficeShouldCreateBlackWhiteBook(){
        FairyTale.createHeader();
        FairyTale.appendText(new StringBuffer("крассивая принцесса."));
        FairyTale.appendText(new StringBuffer("Приехал принц"));
        FairyTale.appendText(new StringBuffer("И уехал"));
        FairyTale.appendFooter();

        EditorialOffice editorialOffice=new BlackWhiteEditorialOffice();
        Book book=editorialOffice.publishBooksWithText(FairyTale.fairyTaleText.toString());
        System.out.println(book.kindOfBook);

        assertEquals("Black and white book",book.kindOfBook);

        System.out.println(book.read());
    }
}