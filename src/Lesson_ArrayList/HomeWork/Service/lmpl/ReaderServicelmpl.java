package Lesson_ArrayList.HomeWork.Service.lmpl;

import Lesson_ArrayList.HomeWork.Models.Library;
import Lesson_ArrayList.HomeWork.Models.Reader;
import Lesson_ArrayList.HomeWork.Service.ReaderService;
import Lesson_ArrayList.HomeWork.db.LDatabase;

import java.util.List;

public class ReaderServicelmpl implements ReaderService {
    @Override
    public void saveReader(Reader reader) {
        LDatabase.readers.add(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return LDatabase.readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        try {
            for (Reader reader : LDatabase.readers) {
                if (reader.getId().equals(id)){
                    return reader;
                }
            }
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader newReader) {
        try {
            Reader oldReader = getReaderById(id);
            if (oldReader == null) {
                throw new RuntimeException("Reader not found with ID " + id);
            }
            oldReader.setFullName(newReader.getFullName());
            oldReader.setEmail(newReader.getEmail());
            oldReader.setPhoneNumber(newReader.getPhoneNumber());
            oldReader.setGender(newReader.getGender());
            System.out.println("Successfully updated Reader: " + oldReader);
            return oldReader;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String deleteReaderById(Long id) {
        try {
            Reader reader = getReaderById(id);
            if (reader != null) {
                LDatabase.readers.remove(reader);
                return " Reader with ID " + id + " successfully deleted!";
            } else {
                return " Reader with ID " + id + " not found!";
            }
        } catch (Exception e) {
            return " Error while deleting Reader: " + e.getMessage();
        }
    }



}
