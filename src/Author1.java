public class Author1 {
    String nameAuthor1;
    String surnameAuthor1
            ;

    public Author1 (String nameAuthor1, String surnameAuthor1) {
        this.nameAuthor1 = nameAuthor1;
        this.surnameAuthor1 = surnameAuthor1;
    }

    public String getNameAuthor1() {
        return this.nameAuthor1;
    }

    public String getSurnameAuthor1() {
        return this.surnameAuthor1;
    }

    public void setNameAuthor1(String nameAuthor1) {
        this.nameAuthor1 = nameAuthor1;
    }

    public void setSurnameAuthor1(String surnameAuthor1) {
        this.surnameAuthor1 = surnameAuthor1;

    }
    public String toString() {
        return nameAuthor1 + " " + surnameAuthor1;
    }

}
