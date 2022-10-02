package Interface;

import PeopleAndBook.Book;

public interface Reader {
    Book getBook(Administrator administrator, String bookName);

    void returnBook(Book book);
}
