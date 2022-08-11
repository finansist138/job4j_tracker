package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Shantaram", 1000);
        Book book2 = new Book("Kolobok", 10);
        Book book3 = new Book("Teremok", 8);
        Book book4 = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getNumberOfPage());
        }

        System.out.println("Swap 0 and 3");
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getNumberOfPage());
        }

        System.out.println("Print only Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getNumberOfPage());
            }
        }
    }
}
