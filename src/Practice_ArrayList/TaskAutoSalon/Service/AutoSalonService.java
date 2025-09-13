package Practice_ArrayList.TaskAutoSalon.Service;

import Practice_ArrayList.TaskAutoSalon.models.AutoSalon;

import java.util.List;

public interface AutoSalonService {
    void addAutoSalon (AutoSalon newAutoSalon);
    List<AutoSalon>getAllAutoSalons();
    AutoSalon findByAutoSalonId(Long autoSalonId);
    AutoSalon findByAutoSalonName(String autoSalonName);
    void updateById(Long id,AutoSalon newAutoSalon);
    void deleteById(Long id);
}
