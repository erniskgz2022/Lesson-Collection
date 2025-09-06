package Practice_ArrayList.PharmacyManagementSystem.Service.lmpl;

import Practice_ArrayList.PharmacyManagementSystem.Service.MedicineService;
import Practice_ArrayList.PharmacyManagementSystem.db.Database;
import Practice_ArrayList.PharmacyManagementSystem.models.Medicine;
import Practice_ArrayList.PharmacyManagementSystem.models.Pharmacy;

import java.util.List;

public class MedicineServicelpml implements MedicineService {
    @Override
    public void saveMedicineByPharmacyId(Long pharmacyId, Medicine medicine) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
                pharmacy.getMedicines().add(medicine);
            }
        }
    }

    @Override
    public List<Medicine> getAllMedicine(Long pharmacyId) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
               return pharmacy.getMedicines();
            }
        }return null;
    }
}
