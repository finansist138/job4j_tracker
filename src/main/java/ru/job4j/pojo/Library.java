package ru.job4j.pojo;

public class Library {

    private String name;
    private int numberOfPage;

    public Library(String name, int numberOfPage) {
        this.name = name;
        this.numberOfPage = numberOfPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public static void main(String[] args) {
        Library book1 = new Library("Shantaram", 1000);
        Library book2 = new Library("Kolobok", 10);
        Library book3 = new Library("Teremok", 8);
        Library book4 = new Library("Clean code", 0);
        Library[] libraries = new Library[4];
        libraries[0] = book1;
        libraries[1] = book2;
        libraries[2] = book3;
        libraries[3] = book4;
        for (int i = 0; i < libraries.length; i++) {
            Library libr = libraries[i];
            System.out.println(libr.getName() + " - " + libr.getNumberOfPage());
        }

        System.out.println("Swap 0 and 3");
        libraries[0] = book4;
        libraries[3] = book1;
        for (int i = 0; i < libraries.length; i++) {
            Library libr = libraries[i];
            System.out.println(libr.getName() + " - " + libr.getNumberOfPage());
        }

        System.out.println("Print only Clean code");
        for (int i = 0; i < libraries.length; i++) {
            Library libr = libraries[i];
            if (libr.equals(libraries[0])) {
                System.out.println(libr.getName() + " - " + libr.getNumberOfPage());
            }
        }
    }
}
