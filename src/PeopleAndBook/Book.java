package PeopleAndBook;

public class Book {
    public String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}