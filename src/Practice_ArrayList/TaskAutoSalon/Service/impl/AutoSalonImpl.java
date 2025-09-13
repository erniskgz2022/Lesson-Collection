package Practice_ArrayList.TaskAutoSalon.Service.impl;

import Practice_ArrayList.TaskAutoSalon.Service.AutoSalonService;
import Practice_ArrayList.TaskAutoSalon.models.AutoSalon;

import java.util.List;

public class AutoSalonImpl implements AutoSalonService {
    @Override
    public void addAutoSalon(AutoSalon newAutoSalon) {

    }

    @Override
    public List<AutoSalon> getAllAutoSalons() {
        return List.of();
    }

    @Override
    public AutoSalon findByAutoSalonId(Long autoSalonId) {
        return null;
    }

    @Override
    public AutoSalon findByAutoSalonName(String autoSalonName) {
        return null;
    }

    @Override
    public void updateById(Long id, AutoSalon newAutoSalon) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
