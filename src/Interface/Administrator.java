package Interface;
import PeopleAndBook.Book;

public interface Administrator {
    Book search(String bookName);

    void overdueNotification(Reader reader);
}
