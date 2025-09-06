package Lesson_ArrayList.HomeWork.Service;

import Lesson_ArrayList.HomeWork.Models.Library;

import java.util.List;

public interface LibraryService {
    List<Library> saveLibrary(List<Library> libraries);

    List<Library>getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library newLibrary);

    String deleteLibrary(Long id);
}
