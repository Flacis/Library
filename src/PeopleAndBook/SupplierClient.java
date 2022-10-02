package PeopleAndBook;

import Interface.Administrator;
import Interface.Reader;
import Interface.Supplier;

public class SupplierClient implements Reader, Supplier {
    public SupplierClient() {
        super();
    }

    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Поставщик получил книгу с названием: " + targetBook);
        return targetBook;
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Поставщик вернул книгу " + book + " в библиотеку");

    }

    @Override
    public void addBooks(Book[] books) {
        System.out.println("Поставщик поставил следующие книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

    }
}
