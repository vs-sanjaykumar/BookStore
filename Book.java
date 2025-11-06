public class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;

    public  Book (String title , String author , double price , String isbn){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isbn=isbn;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    double getPrice(){
        return this.price;
    }
    String getIsbn(){
        return this.isbn;
    }
    
    String displayBook(){
        return this.title+" by "+this.author+" price : "+this.price;
    }

}
