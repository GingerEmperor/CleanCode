package Functions.FunctionalProblems.TheBestOfTheBestCode;

public abstract class Book {
    String kindOfBook;

    private String page;

    public void write(String words){
        this.page=words;
    }

    public String read() {
        return page;
    }



    public String getKindOfBook(){
        return kindOfBook;
    }
}
