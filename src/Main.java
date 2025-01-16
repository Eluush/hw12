public class Main {
    public static void main(String[] args) {


        Author sholokhov = new Author("Михаил", "Шолохов");
        Book quietDon = new Book("Тихий дон" , sholokhov , 1925);
        System.out.println("quietDon.title = " + quietDon.getTitle());
        System.out.println("quietDon.getAuthor() = " + quietDon.getAuthor());
        System.out.println("quietDon.year = " + quietDon.getYear());
        quietDon.setYear(1932);
        System.out.println("quietDon.setYear() = " + quietDon.getYear());

        System.out.println("sholokhov.nameAuthor = " + sholokhov.nameAuthor);
        System.out.println("sholokhov.surnameAuthor = " + sholokhov.surnameAuthor);

        //1
        Author1 zuzak = new Author1("Маркус" ,"Зузак");
        Book1 theBookThier = new Book1("Книжный вор",zuzak,2006);
        System.out.println("theBookThier.getTitle1() = " + theBookThier.getTitle1());
        System.out.println("theBookThier.getAuthor1() = " + theBookThier.getAuthor1());
        System.out.println("theBookThier.getYear1() = " + theBookThier.getYear1());
        theBookThier.setYear1(2000);
        System.out.println("theBookThier.getYear1() = " + theBookThier.getYear1());

        System.out.println("zuzak.nameAuthor = " + zuzak.nameAuthor1);
        System.out.println("zuzak.surnameAuthor = " + zuzak.surnameAuthor1);


        //2
        Author2 tolstoy = new Author2("Лев","Толстой");
        Book2 annaKarenina = new Book2("Анна Каренина",tolstoy,1877);
        System.out.println("annaKarenina.getTitle() = " + annaKarenina.getTitle2());
        System.out.println("annaKarenina.getAuthor2() = " + annaKarenina.getAuthor2());
        System.out.println("annaKarenina.getYear2() = " + annaKarenina.getYear2());

        System.out.println("tolstoy.getNameAutho2() = " + tolstoy.getNameAuthor2());
        System.out.println("tolstoy.getSurnameAuthor2() = " + tolstoy.getSurnameAuthor2());


    }
}