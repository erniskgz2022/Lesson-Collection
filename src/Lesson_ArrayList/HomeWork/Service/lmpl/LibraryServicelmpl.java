package Lesson_ArrayList.HomeWork.Service.lmpl;

import Lesson_ArrayList.HomeWork.Models.Library;
import Lesson_ArrayList.HomeWork.Service.LibraryService;
import Lesson_ArrayList.HomeWork.db.LDatabase;
import Practice_ArrayList.PharmacyManagementSystem.db.Database;

import java.util.List;

public class LibraryServicelmpl implements LibraryService {
    @Override
    public List<Library>    saveLibrary(List<Library> libraries) {
        LDatabase.libraries.addAll(libraries);
        return LDatabase.libraries;
    }

    @Override
    public List<Library> getAllLibraries() {
        return LDatabase.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        try{
            for (Library library : LDatabase.libraries) {
                if (library.getId() == id){
                    return library;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library newLibrary) {
        try {
            Library oldLibrary = getLibraryById(id);
            if (oldLibrary == null) {
                throw new RuntimeException("Library not found with ID " + id);
            }
            oldLibrary.setName(newLibrary.getName());
            if (oldLibrary.getAddress().equals(newLibrary.getAddress())) {
                throw new RuntimeException("Old address cannot be same as new address");
            } else {
                oldLibrary.setAddress(newLibrary.getAddress());
            }
            return oldLibrary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String deleteLibrary(Long id) {
        try {
            if (id == null || id == 0) {
                throw new RuntimeException("ID null болбойт же терс сан болбойт");
            }
            Library deleteLibrary = getLibraryById(id);
            if (deleteLibrary != null) {
                LDatabase.libraries.remove(deleteLibrary);
                return "Successfully deleted library with ID " + id;
            } else {
                return "Library not found with ID " + id;
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
