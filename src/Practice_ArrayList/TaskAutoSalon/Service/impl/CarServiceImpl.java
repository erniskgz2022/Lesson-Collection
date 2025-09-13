package Practice_ArrayList.TaskAutoSalon.Service.impl;

import Practice_ArrayList.TaskAutoSalon.Service.CarService;
import Practice_ArrayList.TaskAutoSalon.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public void addCarByAutoSalonID(Long id, Car newCar) {

    }

    @Override
    public List<Car> getAllCars() {
        return List.of();
    }

    @Override
    public Car findByCarId(Long id) {
        return null;
    }

    @Override
    public Car findByCarName(String name) {
        return null;
    }

    @Override
    public void updateById(Long id, Car newCar) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
