package Functions.FunctionalProblems.TheBestOfTheBestCode;

import java.util.ArrayList;
import java.util.List;

public abstract class EditorialOffice {  //TODO to add details addDetailsBeforePrinting();  addDetailsAfterPrinting();
    public Book publishBooksWithText(String text){
        dryPaper();
        wetInc();

        addDetailsBeforePrinting();

        Book bookToPublish=printBook(text);

        addDetailsAfterPrinting();
        makeBinding();

        System.out.println("!!!Book is published!!!");
        System.out.println();

        return bookToPublish;
    }


    private void dryPaper(){
        System.out.println("Drying paper...");
    }

    private void wetInc(){
        System.out.println("Wet the inks...");
    }

    abstract void addDetailsBeforePrinting();

    abstract Book printBook(String text);

    abstract void addDetailsAfterPrinting();

    private void makeBinding(){
        System.out.println("Sew into binding...");
    }

}
