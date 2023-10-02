package Homework12;

public class HomeWork12 {
    public static void main(String[] args) {

        Author oruell = new Author("Джордж", "Оруэлл");
        Author verber = new Author("Бернар", "Вербер");
        System.out.println(oruell.getFirstname() + " " + oruell.getSurname());
        System.out.println(verber.getFirstname() + " " + verber.getSurname());

        Book book1 = new Book("1984", oruell, 1949);
        Book book2 = new Book("Шестой сон", verber, 2015);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getYear());

        book2.setYear(2020);
        System.out.println("Переиздание книги Шестой сон в " + book2.getYear());
    }
}