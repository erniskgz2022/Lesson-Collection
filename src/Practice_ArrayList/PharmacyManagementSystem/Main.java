package Practice_ArrayList.PharmacyManagementSystem;

import Practice_ArrayList.PharmacyManagementSystem.Enums.Gender;
import Practice_ArrayList.PharmacyManagementSystem.Enums.Position;
import Practice_ArrayList.PharmacyManagementSystem.Service.lmpl.EmployeeServicelmpl;
import Practice_ArrayList.PharmacyManagementSystem.Service.lmpl.MedicineServicelpml;
import Practice_ArrayList.PharmacyManagementSystem.Service.lmpl.PharmacyServicelmpl;
import Practice_ArrayList.PharmacyManagementSystem.models.Employee;
import Practice_ArrayList.PharmacyManagementSystem.models.Medicine;
import Practice_ArrayList.PharmacyManagementSystem.models.Pharmacy;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeServicelmpl employeeService = new EmployeeServicelmpl();
        MedicineServicelpml medicineService = new MedicineServicelpml();
        PharmacyServicelmpl pharmacyService = new PharmacyServicelmpl();

        while (true) {
            System.out.println("\n===== Main Menu =====");
            System.out.println("1. Pharmacy");
            System.out.println("2. Employee");
            System.out.println("3. Medicine");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    while (true) {
                        System.out.println("\n--- Pharmacy Menu ---");
                        System.out.println("1. Add Pharmacy");
                        System.out.println("2. Get All Pharmacy");
                        System.out.println("3. Find Pharmacy by ID");
                        System.out.println("4. Update Pharmacy");
                        System.out.println("5. Remove Pharmacy");
                        System.out.println("0. Back");

                        int sub = scanner.nextInt();
                        scanner.nextLine();
                        if (sub == 0) break;

                        switch (sub) {
                            case 1:
                                System.out.print("Name: ");
                                String name = scanner.nextLine();
                                System.out.print("Address: ");
                                String address = scanner.nextLine();
                                Pharmacy ph = new Pharmacy(name, address);
                                pharmacyService.savePharmacy(ph);
                                System.out.println("Successfully added Pharmacy!");
                                break;

                            case 2:
                                System.out.println(pharmacyService.getALlPharmacies());
                                break;

                            case 3:
                                System.out.print("ID: ");
                                Long id = scanner.nextLong();
                                System.out.println(pharmacyService.getPharmacyById(id));
                                break;

                            case 4:
                                System.out.print("ID: ");
                                Long updId = scanner.nextLong();
                                scanner.nextLine();
                                System.out.print("New Name: ");
                                String newName = scanner.nextLine();
                                System.out.print("New Address: ");
                                String newAddr = scanner.nextLine();
                                Pharmacy newPh = new Pharmacy(newName, newAddr);
                                pharmacyService.updatePharmacyByName(updId, newPh);
                                break;

                            case 5:
                                System.out.print("ID: ");
                                Long delId = scanner.nextLong();
                                pharmacyService.deletePharmacyById(delId);
                                break;
                        }
                    }
                    break;

                case 2:

                    while (true) {
                        System.out.println("\n--- Employee Menu ---");
                        System.out.println("1. Add Employee to Pharmacy");
                        System.out.println("2. Get All Employees by Pharmacy ID");
                        System.out.println("3. Find Employee by ID");
                        System.out.println("4. Update Employee");
                        System.out.println("5. Remove Employee");
                        System.out.println("0. Back");

                        int sub = scanner.nextInt();
                        scanner.nextLine();
                        if (sub == 0) break;

                        switch (sub) {
                            case 1:
                                System.out.print("Pharmacy ID: ");
                                Long phIdEmp = scanner.nextLong();
                                scanner.nextLine();

                                System.out.print("Full Name: ");
                                String fullName = scanner.nextLine();
                                System.out.print("Email: ");
                                String email = scanner.nextLine();
                                System.out.print("Phone Number: ");
                                String phone = scanner.nextLine();
                                System.out.print("Experience: ");
                                double exp = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.print("Gender (MALE/FEMALE): ");
                                Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
                                System.out.print("Position (ADMIN/PHARMACIST/TELLER): ");
                                Position pos = Position.valueOf(scanner.nextLine().toUpperCase());

                                Employee emp = new Employee(fullName, email, phone, exp, pos, gender);

                                Pharmacy ph = pharmacyService.getPharmacyById(phIdEmp);
                                if (ph != null) {
                                    ph.getEmployees().add(emp);
                                    System.out.println("Successfully added Employee to Pharmacy!");
                                } else {
                                    System.out.println("Pharmacy not found!");
                                }
                                break;

                            case 2:
                                System.out.print("Pharmacy ID: ");
                                Long getPhId = scanner.nextLong();
                                scanner.nextLine();
                                Pharmacy getPh = pharmacyService.getPharmacyById(getPhId);
                                if (getPh != null && !getPh.getEmployees().isEmpty()) {
                                    System.out.println("Employees in Pharmacy " + getPh.getName() + ":");
                                    for (Employee e : getPh.getEmployees()) {
                                        System.out.println(e);
                                    }
                                } else {
                                    System.out.println("No employees found for this Pharmacy!");
                                }
                                break;

                            case 3:
                                System.out.print("Employee ID: ");
                                Long empId = scanner.nextLong();
                                scanner.nextLine();
                                Employee foundEmp = employeeService.getEmployeeById(empId);
                                if (foundEmp != null) {
                                    System.out.println(foundEmp);
                                } else {
                                    System.out.println("Employee not found!");
                                }
                                break;

                            case 4:
                                System.out.print("Employee ID: ");
                                Long upEmpId = scanner.nextLong();
                                scanner.nextLine();
                                System.out.print("New Full Name: ");
                                String nFull = scanner.nextLine();
                                System.out.print("New Email: ");
                                String nEmail = scanner.nextLine();
                                System.out.print("New Phone Number: ");
                                String nPhone = scanner.nextLine();
                                System.out.print("New Experience: ");
                                double nExp = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.print("New Gender (MALE/FEMALE): ");
                                Gender nGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                                System.out.print("New Position (ADMIN/PHARMACIST/TELLER): ");
                                Position nPos = Position.valueOf(scanner.nextLine().toUpperCase());

                                Employee newEmp = new Employee(nFull, nEmail, nPhone, nExp, nPos, nGender);
                                employeeService.updateEmployeeName(upEmpId, newEmp);
                                break;

                            case 5:
                                System.out.print("Employee ID: ");
                                Long delEmpId = scanner.nextLong();
                                employeeService.deleteEmployeeById(delEmpId);
                                break;
                        }
                    }
                    break;

                case 3:

                    while (true) {
                        System.out.println("\n--- Medicine Menu ---");
                        System.out.println("1. Add medications");
                        System.out.println("2. Get All medications by Pharmacy ID");
                        System.out.println("0. Back");

                        int sub = scanner.nextInt();
                        scanner.nextLine();
                        if (sub == 0) break;

                        switch (sub) {
                            case 1:
                                System.out.print("Pharmacy ID: ");
                                Long phId = scanner.nextLong();
                                scanner.nextLine();
                                System.out.print("Name: ");
                                String mName = scanner.nextLine();
                                System.out.print("Price: ");
                                int price = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Description: ");
                                String desc = scanner.nextLine();
                                System.out.print("Expiration Date (yyyy-mm-dd): ");
                                String dateStr = scanner.nextLine();
                                LocalDate expDate = LocalDate.parse(dateStr);

                                Medicine med = new Medicine(mName, price, desc, expDate);
                                medicineService.saveMedicineByPharmacyId(phId, med);
                                System.out.println("Successfully added Medicine!");
                                break;

                            case 2:
                                System.out.print("Pharmacy ID: ");
                                Long idP = scanner.nextLong();
                                System.out.println(medicineService.getAllMedicine(idP));
                                break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}
