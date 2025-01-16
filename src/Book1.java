public class Book1 {
    private String title1;
    private Author author1;
    private int year1;

    public Book1 (String title1, Author autho1, int year1) {
        this.title1 = title1;
        this.author1 = author1;
        this.year1 = year1;
    }
    public String getTitle1(){
        return this.title1;
    }
    public Author getAuthor1(){
        return this.author1;
    }
    public  int getYear1(){
        return  this.year1;
    }

    public void setTitle(String title1){
        this.title1=title1;
    }

    public void setAuthor(Author author1) {
        this.author1=author1;
    }

    public  void setYear(int year1){
        this.year1=year1;
    }


}
