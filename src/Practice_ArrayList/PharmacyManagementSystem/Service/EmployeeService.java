package Practice_ArrayList.PharmacyManagementSystem.Service;

import Practice_ArrayList.PharmacyManagementSystem.models.Employee;

import java.util.List;

public interface EmployeeService {
    void  saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void updateEmployeeName(Long id,Employee NewEmployee);
    void deleteEmployeeById(Long id);
}
