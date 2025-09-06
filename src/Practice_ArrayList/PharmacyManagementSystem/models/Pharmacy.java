package Practice_ArrayList.PharmacyManagementSystem.models;

import Practice_ArrayList.PharmacyManagementSystem.db.GenerateID;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private Long id;
    private String name;
    private String address;
    private List<Employee> employees = new ArrayList<>();
    private List<Medicine> medicines = new ArrayList<>();


    public Pharmacy() {

    }

    public Pharmacy(String name, String address) {
        this.id = GenerateID.genPharmacyId();
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
        this.medicines = new ArrayList<>();
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String
    toString() {
        return "\n~~~~~~~~~~Pharmacy~~~~~~~~~~~~" + '\n' +
                "ID: " + id + '\n' +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                employees + '\n' +
                medicines + "\n";
    }
}
