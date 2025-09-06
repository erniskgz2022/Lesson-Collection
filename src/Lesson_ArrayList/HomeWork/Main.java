package Lesson_ArrayList.HomeWork;

import Lesson_ArrayList.HomeWork.Enums.Gender;
import Lesson_ArrayList.HomeWork.Enums.Genre;
import Lesson_ArrayList.HomeWork.Models.Book;
import Lesson_ArrayList.HomeWork.Models.Library;
import Lesson_ArrayList.HomeWork.Models.Reader;
import Lesson_ArrayList.HomeWork.Service.BookService;
import Lesson_ArrayList.HomeWork.Service.LibraryService;
import Lesson_ArrayList.HomeWork.Service.ReaderService;
import Lesson_ArrayList.HomeWork.Service.lmpl.BookServicelmpl;
import Lesson_ArrayList.HomeWork.Service.lmpl.LibraryServicelmpl;
import Lesson_ArrayList.HomeWork.Service.lmpl.ReaderServicelmpl;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryService libraryService = new LibraryServicelmpl();
        ReaderService readerService = new ReaderServicelmpl();
        BookService bookService = new BookServicelmpl();

        while (true) {
            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Libraries");
            System.out.println("2. Readers");
            System.out.println("3. Books");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n--- LIBRARY MENU ---");
                        System.out.println("1. Add Library");
                        System.out.println("2. Show All Libraries");
                        System.out.println("3. Update Library");
                        System.out.println("4. Delete Library");
                        System.out.println("0. Back");
                        int c = sc.nextInt();
                        sc.nextLine();

                        if (c == 0) break;
                        switch (c) {
                            case 1:
                                System.out.print("Enter Library Name: ");
                                String lname = sc.nextLine();
                                System.out.print("Enter Library Address: ");
                                String laddr = sc.nextLine();
                                Library lib = new Library(lname, laddr);
                                libraryService.saveLibrary(Collections.singletonList(lib));
                                System.out.println(" Library added!");
                                break;
                            case 2:
                                System.out.println(libraryService.getAllLibraries());
                                break;
                            case 3:
                                System.out.print("Enter Library ID to update: ");
                                Long lid = sc.nextLong();
                                sc.nextLine();
                                System.out.print("New Name: ");
                                String newName = sc.nextLine();
                                System.out.print("New Address: ");
                                String newAddr = sc.nextLine();
                                Library newLib = new Library(newName, newAddr);
                                libraryService.updateLibrary(lid, newLib);
                                break;
                            case 4:
                                System.out.print("Enter Library ID to delete: ");
                                Long dlid = sc.nextLong();
                                System.out.println(libraryService.deleteLibrary(dlid));
                                break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n--- READER MENU ---");
                        System.out.println("1. Add Reader");
                        System.out.println("2. Show All Readers");
                        System.out.println("3. Update Reader");
                        System.out.println("4. Delete Reader");
                        System.out.println("5. Assign Reader to Library");
                        System.out.println("0. Back");
                        int c = sc.nextInt();
                        sc.nextLine();

                        if (c == 0) break;
                        switch (c) {
                            case 1:
                                System.out.print("Full Name: ");
                                String fname = sc.nextLine();
                                System.out.print("Email: ");
                                String email = sc.nextLine();
                                System.out.print("Phone Number: ");
                                String phone = sc.nextLine();
                                System.out.print("Gender (MALE/FEMALE): ");
                                Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());
                                Reader reader = new Reader(fname, email, phone, gender);
                                readerService.saveReader(reader);
                                System.out.println(" Reader added!");
                                break;
                            case 2:
                                System.out.println(readerService.getAllReaders());
                                break;
                            case 3:
                                System.out.print("Enter Reader ID to update: ");
                                Long rid = sc.nextLong();
                                sc.nextLine();
                                System.out.print("New Full Name: ");
                                String nf = sc.nextLine();
                                System.out.print("New Email: ");
                                String ne = sc.nextLine();
                                System.out.print("New Phone: ");
                                String np = sc.nextLine();
                                System.out.print("New Gender (MALE/FEMALE): ");
                                Gender ng = Gender.valueOf(sc.nextLine().toUpperCase());
                                Reader newReader = new Reader(nf, ne, np, ng);
                                readerService.updateReader(rid, newReader);
                                break;

                            case 4:
                            System.out.print("Reader ID: ");
                            Long delId = sc.nextLong();
                            System.out.println(readerService.deleteReaderById(delId));
                            break;

                            case 5:
                                System.out.print("Reader ID: ");
                                Long rId = sc.nextLong();
                                System.out.print("Library ID: ");
                                Long lId = sc.nextLong();
                                // readerService.assignReaderToLibrary(rId, lId);
                                break;
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("\n--- BOOK MENU ---");
                        System.out.println("1. Add Book to Library");
                        System.out.println("2. Show All Books in Library");
                        System.out.println("3. Get Book By ID");
                        System.out.println("4. Delete Book");
                        System.out.println("5. Clear All Books from Library");
                        System.out.println("0. Back");
                        int c = sc.nextInt();
                        sc.nextLine();

                        if (c == 0) break;
                        switch (c) {
                            case 1:
                                System.out.print("Library ID: ");
                                Long libId = sc.nextLong();
                                sc.nextLine();
                                System.out.print("Book Name: ");
                                String bname = sc.nextLine();
                                System.out.print("Author: ");
                                String author = sc.nextLine();
                                System.out.print("Genre (HISTORY, FANTASY, ROMANCE, DETECTIVE, SCIENCE): ");
                                Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());
                                Book book = new Book(bname, author, genre);
                                bookService.saveBook(libId, book);
                                System.out.println(" Book added!");
                                break;
                            case 2:
                                System.out.print("Library ID: ");
                                Long lid = sc.nextLong();
                                System.out.println(bookService.getAllBooks(lid));
                                break;
                            case 3:
                                System.out.print("Library ID: ");
                                Long libbId = sc.nextLong();
                                System.out.print("Book ID: ");
                                Long bId = sc.nextLong();
                                System.out.println(bookService.getBookById(libbId, bId));
                                break;
                            case 4:
                                System.out.print("Library ID: ");
                                Long lbid = sc.nextLong();
                                System.out.print("Book ID: ");
                                Long bid = sc.nextLong();
                                System.out.println(bookService.deleteBook(lbid, bid));
                                break;
                            case 5:
                                System.out.print("Library ID: ");
                                Long lbbid = sc.nextLong();
                                bookService.clearBooksByLibraryId(lbbid);
                                System.out.println("All books cleared!");
                                break;
                        }
                    }
                    break;

                case 0:
                    System.out.println(" Program finished.");
                    return;
            }
        }

    }

}


