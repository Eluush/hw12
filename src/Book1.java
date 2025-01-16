public class Book1 {
    private String title1;
    private Author1 author1;
    private int year1;

    public Book1 (String title1, Author1 author1, int year1) {
        this.title1 = title1;
        this.author1 = author1;
        this.year1 = year1;
    }
    public String getTitle1(){
        return this.title1;
    }
    public Author1 getAuthor1(){
        return this.author1;
    }
    public  int getYear1(){
        return  this.year1;
    }

    public void setTitle1(String title1){
        this.title1=title1;
    }

    public void setAuthor1(Author1 author1) {
        this.author1=author1;
    }

    public  void setYear1(int year1){
        this.year1=year1;
    }


}
