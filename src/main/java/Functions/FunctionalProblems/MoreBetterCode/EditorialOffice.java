package Functions.FunctionalProblems.MoreBetterCode;

import java.util.ArrayList;
import java.util.List;

public class EditorialOffice {

    public Book publishBooksWithText(String text){//надо Плохо. Однин уровень абстракции на один метод
        System.out.println("Drying paper...");
        System.out.println("Wet the inks...");

        Book bookToPublish=new Book();                // Плохо Создание книги(Надо изолировать)
        bookToPublish.write(text);                    // Book bookToPublish = printBook(text)
        System.out.println("Printing text...");

        System.out.println("Sew into binding...");

        System.out.println("!!!Book is published!!!");
        System.out.println();

        return bookToPublish;
    }


//    public Book publishBooksWithText(String text){
//        dryPaper();
//        wetInc();
//
//        Book bookToPublish=printBook(text);
//
//        makeBinding();
//
//        System.out.println("!!!Book is published!!!");
//        System.out.println();
//
//        return bookToPublish;
//    }

    private void dryPaper(){
        System.out.println("Drying paper...");
    }

    private void wetInc(){
        System.out.println("Wet the inks...");
    }

    Book printBook(String text){
        Book book=new Book();
        book.write(text);
        System.out.println("Printing text...");
        return book;
    }

    private void makeBinding(){
        System.out.println("Sew into binding...");
    }



    ////////////////////////////////////////

    public List<Book> getListOfBooks(int numberOfBooks){
        List<Book>bookListToReturn=new ArrayList<>();
        for (int i = 0; i <numberOfBooks ; i++) {
            Book book=new Book();                             //  ПЛОХО
            book.write(FairyTale.fairyTaleText.toString());   //Создание книги
            bookListToReturn.add(book);
        }
        return bookListToReturn;
    }

//
//    public List<Book> getListOfBooks(int numberOfBooks){
//        List<Book>bookListToReturn=new ArrayList<>();
//        for (int i = 0; i <numberOfBooks ; i++) {
//            bookListToReturn.add(createRandomFairyTale());
//        }
//        return bookListToReturn;
//    }
//
//    private Book createRandomFairyTale(){
//        Book book=new Book();
//        book.write(FairyTale.fairyTaleText.toString());
//        return book;
//    }
}
