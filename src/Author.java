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


    @Override
    public String toString(){
        return "Имя -" + this.name + " Фамилия -" + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name.equals(author.name) && surname.equals(author.surname);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name) + java.util.Objects.hash(surname);

    }

}