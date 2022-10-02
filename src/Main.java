import Interface.*;
import PeopleAndBook.Book;
import PeopleAndBook.ReaderImpl;
import PeopleAndBook.SmallLibraryWorker;
import PeopleAndBook.SupplierClient;

public class Main {

    public static void main(String[] args) {
        Administrator petya = new SmallLibraryWorker();
        SupplierClient ola = new SupplierClient();
        Supplier olaAsSupplier = ola;
        Reader olaAsReader = ola;
        Reader kolya = new ReaderImpl();
        Book kolyaBook = kolya.getBook(petya, "Война и мир");
        olaAsReader.getBook(petya, "Черный обелиск");
        petya.overdueNotification(kolya);
        kolya.returnBook(kolyaBook);

        olaAsSupplier.addBooks(new Book[]{
                new Book("Идиот"),
                new Book("Фауст"),
                new Book("Преступление и наказание")
        });
    }
}