package Functions.FunctionalProblems.MoreBetterCode;

import org.junit.jupiter.api.Test;

class EditorialOfficeMoreBetterTest {

    @Test
    void shouldPublishBookWithText() {
        FairyTale.createHeader();
        FairyTale.appendText(new StringBuffer("крассивая принцесса."));
        FairyTale.appendText(new StringBuffer("Приехал принц"));
        FairyTale.appendText(new StringBuffer("И уехал"));
        FairyTale.appendFooter();

//
//        System.out.println(FairyTale.fairyTaleText);

        EditorialOffice editorialOffice=new EditorialOffice();
        Book book= editorialOffice.publishBooksWithText(FairyTale.fairyTaleText.toString());
        System.out.println(book.read());


    }
}