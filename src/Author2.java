public class Author2 {
    String nameAuthor2;
    String surnameAuthor2;

    public Author2 (String nameAuthor2, String surnameAuthor2) {
        this.nameAuthor2 = nameAuthor2;
        this.surnameAuthor2 = surnameAuthor2;
    }

    public String getNameAuthor2() {
        return this.nameAuthor2;
    }

    public String getSurnameAuthor2() {
        return this.surnameAuthor2;
    }

    public void setNameAuthor2(String nameAuthor2) {
        this.nameAuthor2 = nameAuthor2;
    }

    public void setSurnameAuthor2(String surnameAuthor2) {
        this.surnameAuthor2 = surnameAuthor2;

    }
    public String toString() {
        return nameAuthor2 + " " + surnameAuthor2;
    }

}
