import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public  int getYear(){
        return  this.year;
    }

    public void setTitle(String title){
         this.title=title;
    }

    public void setAuthor(Author author) {
         this.author=author;
    }

    public  void setYear(int year){
         this.year=year;
    }

    @Override
    public String toString(){
        return "Название книги-" + title + " ,Автор - " + author + " ,Год выпуска-" + year;
    }



    @Override
    public int hashCode(){
        return Objects.hash(title,author,year) ;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }





}


