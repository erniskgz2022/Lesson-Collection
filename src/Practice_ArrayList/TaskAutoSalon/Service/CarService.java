package Practice_ArrayList.TaskAutoSalon.Service;

import Practice_ArrayList.TaskAutoSalon.models.Car;

import java.util.List;

public interface CarService {

    void addCarByAutoSalonID (Long id, Car newCar);
    List<Car> getAllCars();
    Car findByCarId(Long id);
    Car findByCarName(String name);
    void updateById(Long id, Car newCar);
    void deleteById(Long id);
}
