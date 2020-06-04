package Functions.FunctionalProblems.BadCode;

import org.junit.jupiter.api.Test;

import static Functions.FunctionalProblems.BadCode.FairyTale.*;
import static Functions.FunctionalProblems.BadCode.FairyTale.fairyTaleText;

public class FairyTaleBadTest {
    @Test
    public void fairyTaleTest() {
        createHeader(fairyTaleText);// FairyTale.appendHeader();
        appendText(new StringBuffer("Крассивая принцесса."));//Лучше: FairyTale.appendText("a beautiful princes");
        appendText(new StringBuffer("Приехал принц"));
        appendText(new StringBuffer("И уехал"));
        appendFooter(fairyTaleText);// FairyTale.appendFooter();

        System.out.println(fairyTaleText);



//        FairyTale.createHeader();
//        FairyTale.appendText(new StringBuffer("крассивая принцесса."));
//        FairyTale.appendText(new StringBuffer("Приехал принц"));
//        FairyTale.appendText(new StringBuffer("И уехал"));
//        FairyTale.appendFooter();
//
//        System.out.println(FairyTale.fairyTaleText);

    }



}
