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
        System.out.println("theBookThier.getTitle() = " + theBookThier.getTitle1());
        System.out.println("theBookThier.getAuthor() = " + theBookThier.getAuthor1());
        System.out.println("theBookThier.getYear() = " + theBookThier.getYear1());

        System.out.println("zuzak.nameAuthor = " + zuzak.nameAuthor1);
        System.out.println("zuzak.surnameAuthor = " + zuzak.surnameAuthor1);


    }
}