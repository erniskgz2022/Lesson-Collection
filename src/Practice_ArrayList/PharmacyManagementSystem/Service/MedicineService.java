package Practice_ArrayList.PharmacyManagementSystem.Service;

import Practice_ArrayList.PharmacyManagementSystem.models.Medicine;

import java.util.List;

public interface MedicineService {
    void saveMedicineByPharmacyId(Long pharmacyId, Medicine medicine);
    List<Medicine> getAllMedicine(Long pharmacyId);
}
