package Lesson_ArrayList.HomeWork.Service.lmpl;

import Lesson_ArrayList.HomeWork.Models.Book;
import Lesson_ArrayList.HomeWork.Models.Library;
import Lesson_ArrayList.HomeWork.Service.BookService;
import Lesson_ArrayList.HomeWork.db.LDatabase;

import java.util.List;

public class BookServicelmpl implements BookService {
    @Override
    public Book saveBook(Long libraryId, Book book) {
        try {
            for (Library library : LDatabase.libraries) {
                if (library.getId() == libraryId){
                     library.getBooks().add(book);
                     return book;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (Library library : LDatabase.libraries) {
            if (library.getId() == libraryId){
                return library.getBooks();
            }
        }
        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Library library : LDatabase.libraries) {
            if (library.getId().equals(libraryId)) {
                for (Book book : library.getBooks()) {
                    if (book.getId().equals(bookId)) {
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (Library library : LDatabase.libraries) {
            if (library.getId().equals(libraryId)) {
                for (Book book : library.getBooks()) {
                    if (book.getId().equals(bookId)) {
                        library.getBooks().remove(book);
                        return "Successfully deleted Book with ID " + bookId;
                    }
                }
                return "Book not found in Library with ID " + libraryId;
            }
        }
        return "Library not found with ID " + libraryId;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library : LDatabase.libraries) {
            if (library.getId().equals(libraryId)) {
                library.getBooks().clear();
                System.out.println("All books cleared in Library ID " + libraryId);
                return;
            }
        }
        System.out.println("Library not found with ID " + libraryId);
    }
}
