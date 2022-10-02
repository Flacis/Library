package PeopleAndBook;

import Interface.Administrator;
import Interface.Reader;

public class ReaderImpl implements Reader {
    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Читатель получил книгу с названием: " + targetBook);
        return targetBook;

    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Читатель вернули книгу " + book + " в библиотеку");

    }
}
