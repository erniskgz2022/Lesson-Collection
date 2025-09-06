package Practice_ArrayList.PharmacyManagementSystem.Service.lmpl;

import Practice_ArrayList.PharmacyManagementSystem.Service.EmployeeService;

import Practice_ArrayList.PharmacyManagementSystem.db.Database;
import Practice_ArrayList.PharmacyManagementSystem.models.Employee;

import java.util.List;



public class EmployeeServicelmpl implements EmployeeService {


    @Override
    public void saveEmployee(Employee employee) {
        Database.employees.add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return Database.employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        try{
            for (Employee employee : Database.employees) {
                if (employee.getId() == id){
                    return employee;
                }
            }
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void updateEmployeeName(Long id, Employee newEmployee) {
        try {
            Employee oldEmployee = getEmployeeById(id);
            oldEmployee.setFullName(newEmployee.getFullName());
            oldEmployee.setEmail(newEmployee.getEmail());
            oldEmployee.setPhoneNumber(newEmployee.getPhoneNumber());
            oldEmployee.setExperience(newEmployee.getExperience());
            oldEmployee.setGender(newEmployee.getGender());
            oldEmployee.setPosition(newEmployee.getPosition());

            System.out.println("Successfully updated Employee: " + oldEmployee);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteEmployeeById(Long id) {
        try {
            Employee employee = getEmployeeById(id);
            Database.employees.remove(employee);
            System.out.println("Successfully delete!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
