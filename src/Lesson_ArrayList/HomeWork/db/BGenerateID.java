package Lesson_ArrayList.HomeWork.db;

public class BGenerateID {
    private static  Long libraryId = 0L;
    private static  Long bookId = 0L;
    private static Long readerId = 0L;

    public static Long genLibraryId(){
        return ++libraryId;
    }
    public static Long genBookId(){
        return ++bookId;
    }
    public static Long genReaderId(){
        return ++readerId;
    }



}
