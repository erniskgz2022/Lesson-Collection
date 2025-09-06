package Lesson_ArrayList.HomeWork.Service;

import Lesson_ArrayList.HomeWork.Models.Reader;

import java.util.List;

public interface ReaderService {
    void saveReader(Reader reader);

    List<Reader> getAllReaders();

    Reader getReaderById(Long id);

    Reader updateReader(Long id, Reader reader);
    String deleteReaderById(Long id);

//    void assignReaderToLibrary(Long readerId,Long libraryId);
}
