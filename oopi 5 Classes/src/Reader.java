import java.lang.String;

import java.util.Date;

public class Reader {
    String name;
    String secondname;
    String surname;
    int ticketNumber;
    String faculty;
    Date birthday;
    int phoneNumber;

    public Reader(String name,String secondname,String surname){
        this.name=name;
        this.secondname=secondname;
        this.surname=surname;
    }
    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(int value) {
        System.out.println(name + " " + secondname + " " + surname + " взял " + value + " книг(и)");
        System.out.println(" ");
    }

    public void takeBook(String... value) {
        System.out.println(name + " " + secondname + " " + surname + " взял книги: ");
        for (String a : value)
            System.out.print(a + ", ");
            System.out.println(" ");
        System.out.println(" ");
    }

    public void takeBook(Book... value) {
        System.out.println(name + " " + secondname + " " + surname + " взял книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
            System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(int value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул " + value + " книг(и)");
        System.out.println(" ");
    }

    public void returnBook(String... value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул книги: ");
        for (String a : value)
            System.out.print(a + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(Book... value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Reader[] readers=new Reader[5];
        readers[0]=new Reader("Василий","Иванов","Иванович");
        readers[1]=new Reader("Елена","Елизарова","Анатольевна");
        readers[2]=new Reader("Илья","Волков","Дмитриевич");
        readers[3]=new Reader("Женя","Иванова","Сергеевна");
        readers[4]=new Reader("Петр","Кочугаев","Николаевич") ;

        Book booking=new Book("Легенда о Золотом драконе","А.С. Пушкин");
        Book booking1=new Book("Легенды","В.С. Тютчев");
        Book booking2=new Book("Реверс-Инжиниринг","Клод Моне");

        readers[0].returnBook(booking);
        readers[1].returnBook(2);
        readers[2].takeBook(5);
        readers[3].takeBook("Наноэлектроника");
        readers[4].takeBook(booking,booking1,booking2);
    }

}
