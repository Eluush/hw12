public class Main {
    public static void main(String[] args) {


        Author sholokhov = new Author("Михаил", "Шолохов");
        Book quietDon = new Book("Тихий дон" , sholokhov , 1925);
        System.out.println("quietDon.title = " + quietDon.getTitle());
        System.out.println("quietDon.getAuthor() = " + quietDon.getAuthor());
        System.out.println("quietDon.year = " + quietDon.getYear());
        quietDon.setYear(1932);
        System.out.println("quietDon.setYear() = " + quietDon.getYear());

        System.out.println("sholokhov.getNameAuthor() = " + sholokhov.getNameAuthor());
        System.out.println("sholokhov.getSurnameAuthor() = " + sholokhov.getSurnameAuthor());

        //1
        Author zuzak = new Author("Маркус" ,"Зузак");
        Book theBookThier = new Book("Книжный вор",zuzak,2006);
        System.out.println("theBookThier.getTitle1() = " + theBookThier.getTitle());
        System.out.println("theBookThier.getAuthor1() = " + theBookThier.getAuthor());
        System.out.println("theBookThier.getYear1() = " + theBookThier.getYear());
        theBookThier.setYear(2000);
        System.out.println("theBookThier.getYear1() = " + theBookThier.getYear());

        System.out.println("zuzak.getNameAuthor() = " + zuzak.getNameAuthor());
        System.out.println("zuzak.getSurnameAuthor() = " + zuzak.getSurnameAuthor());


        //2
        Author tolstoy = new Author("Лев","Толстой");
        Book annaKarenina = new Book("Анна Каренина",tolstoy,1877);
        System.out.println("annaKarenina.getTitle() = " + annaKarenina.getTitle());
        System.out.println("annaKarenina.getAuthor2() = " + annaKarenina.getAuthor());
        System.out.println("annaKarenina.getYear2() = " + annaKarenina.getYear());

        System.out.println("tolstoy.getNameAutho2() = " + tolstoy.getNameAuthor());
        System.out.println("tolstoy.getSurnameAuthor2() = " + tolstoy.getSurnameAuthor());


    }
}