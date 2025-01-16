public class Author1 {
    String nameAuthor1;
    String surnameAuthor1
            ;

    public Author1 (String nameAuthor1, String surnameAuthor1) {
        this.nameAuthor1 = nameAuthor1;
        this.surnameAuthor1 = surnameAuthor1;
    }

    public String getNameAuthor() {
        return this.nameAuthor1;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor1;
    }

    public void setNameAuthor(String nameAuthor1) {
        this.nameAuthor1 = nameAuthor1;
    }

    public void setSurnameAuthor(String surnameAuthor1) {
        this.surnameAuthor1 = surnameAuthor1;

    }
    public String toString() {
        return nameAuthor1 + " " + surnameAuthor1;
    }

}
