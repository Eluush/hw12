public class Author {
    private String name ;
    private String surname;

    public Author(String nameAuthor, String surnameAuthor) {
        this.name = nameAuthor;
        this.surname = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.name;
    }

    public String getSurnameAuthor() {
        return this.surname;
    }

    public void setNameAuthor(String nameAuthor) {
        this.name = nameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surname = surnameAuthor;

    }
    public String toString() {
        return name + " " + surname;
    }

}