package PeopleAndBook;

import Interface.Administrator;
import Interface.Librarian;
import Interface.Reader;

public class SmallLibraryWorker implements Administrator, Librarian {
    @Override
    public Book search(String bookName) {
        System.out.println("Администратор нашел книгу " + bookName);
        return new Book(bookName);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор уведомил о просрочке");

    }

    @Override
    public void orderBooks(String bookName, int count) {
        System.out.println("Библиотекарь заказал " + count + " книг " + bookName);

    }
}
