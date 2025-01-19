public class Main {
    public static void main(String[] args) {


        Author sholokhov = new Author("Михаил", "Шолохов");
        Book quietDon = new Book("Тихий дон", sholokhov, 1925);
        System.out.println("quietDon.toString() = " + quietDon.toString());
        quietDon.setYear(1932);
        System.out.println("quietDon.setYear() = " + quietDon.getYear());

        System.out.println("sholokhov.toString() = " + sholokhov.toString());

        //1
        Author zuzak = new Author("Маркус", "Зузак");
        Book theBookThier = new Book("Книжный вор", zuzak, 2006);
        System.out.println("theBookThier.toString() = " + theBookThier.toString());
        theBookThier.setYear(2000);
        System.out.println("theBookThier.getYear1() = " + theBookThier.getYear());

        System.out.println("zuzak.toString() = " + zuzak.toString());


        //2
        Author tolstoy = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина", tolstoy, 1877);
        System.out.println("annaKarenina.toString() = " + annaKarenina.toString());

        System.out.println("tolstoy.toString() = " + tolstoy.toString());

        //equalsAuthor
        System.out.println(sholokhov.equals(zuzak));
        System.out.println(sholokhov.equals(tolstoy));
        System.out.println(zuzak.equals(tolstoy));
        System.out.println(sholokhov.equals(sholokhov));

        //equalsBook
        System.out.println(annaKarenina.equals(theBookThier));
        System.out.println(annaKarenina.equals(quietDon));
        System.out.println(theBookThier.equals(quietDon));
        System.out.println(annaKarenina.equals(annaKarenina));


        //hashCodeAuthor
        System.out.println(sholokhov.hashCode());
        System.out.println(zuzak.hashCode());
        System.out.println(tolstoy.hashCode());

        //hashCodeBook
        System.out.println(annaKarenina.hashCode());
        System.out.println(theBookThier.hashCode());
        System.out.println(quietDon.hashCode());






    }
}