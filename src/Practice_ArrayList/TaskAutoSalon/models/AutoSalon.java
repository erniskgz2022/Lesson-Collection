package Practice_ArrayList.TaskAutoSalon.models;

import java.util.List;

public class AutoSalon {
    Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String workingHours;
    private List<Car> carList;

    public AutoSalon() {
    }

    public AutoSalon(Long id, String name, String address, String phoneNumber, String workingHours, List<Car> carList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
        this.carList = carList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "AutoSalon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", carList=" + carList +
                '}';
    }
}
