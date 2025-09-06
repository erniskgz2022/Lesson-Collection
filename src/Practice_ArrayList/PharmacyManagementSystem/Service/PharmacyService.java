package Practice_ArrayList.PharmacyManagementSystem.Service;

import Practice_ArrayList.PharmacyManagementSystem.models.Pharmacy;

import java.util.List;

public interface PharmacyService {
    void savePharmacy(Pharmacy pharmacy);
    List<Pharmacy> getALlPharmacies();
    Pharmacy getPharmacyById(Long id);
    void updatePharmacyByName(Long id, Pharmacy newPharmacy);
    void deletePharmacyById(Long id);
}
