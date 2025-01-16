public class Book2 {
    private String title2;
    private Author2 author2;
    private int year2;

    public Book2 (String title2, Author2 author2, int year2) {
        this.title2 = title2;
        this.author2 = author2;
        this.year2 = year2;
    }
    public String getTitle2(){
        return this.title2;
    }
    public Author2 getAuthor2(){
        return this.author2;
    }
    public  int getYear2(){
        return  this.year2;
    }

    public void setTitle2(String title2){
        this.title2=title2;
    }

    public void setAuthor2(Author2 author2) {
        this.author2=author2;
    }

    public  void setYear2(int year2){
        this.year2=year2;
    }


}
