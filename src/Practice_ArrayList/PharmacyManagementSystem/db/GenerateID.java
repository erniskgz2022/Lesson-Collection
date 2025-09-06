package Practice_ArrayList.PharmacyManagementSystem.db;

public class GenerateID {
    private static  Long pharmacyId = 0L;
    private static  Long employeeId = 0L;
    private static Long medicineId = 0L;

    public static Long genPharmacyId(){
        return ++pharmacyId;
    }
    public static Long genMedicineId(){
        return ++medicineId;
    }
    public static Long genEmployeeId(){
        return ++employeeId;
    }



}
