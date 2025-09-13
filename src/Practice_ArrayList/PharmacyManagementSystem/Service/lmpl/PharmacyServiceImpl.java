package Practice_ArrayList.PharmacyManagementSystem.Service.lmpl;

import Practice_ArrayList.PharmacyManagementSystem.Service.PharmacyService;
import Practice_ArrayList.PharmacyManagementSystem.db.Database;
import Practice_ArrayList.PharmacyManagementSystem.models.Pharmacy;

import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {

    @Override
    public void savePharmacy(Pharmacy pharmacy) {
        Database.pharmacies.add(pharmacy);
    }

    @Override
    public List<Pharmacy> getALlPharmacies() {
        return Database.pharmacies;
    }

    @Override
    public Pharmacy getPharmacyById(Long id) {
        try {
            for (Pharmacy pharmacy : Database.pharmacies) {
                if (pharmacy.getId() == id){
                    return pharmacy;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
        return null;
    }

    @Override
    public void updatePharmacyByName(Long id, Pharmacy newPharmacy) {
            try {
                Pharmacy oldPharmacy = getPharmacyById(id);
                oldPharmacy.setName(newPharmacy.getName());
                if (oldPharmacy.getAddress().equals(newPharmacy.getAddress())){
                    throw  new RuntimeException("Eski address jany addresske barabar bolo albayt");
                }else {
                    oldPharmacy.setAddress(newPharmacy.getAddress());
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }

    @Override
    public void deletePharmacyById(Long id) {
        try {
            if (id == null || id <= 0){
                throw  new RuntimeException("ID null bolo albayt je Ters san bolo albayt");
            }
            Pharmacy deletePharmacy = getPharmacyById(id);
            Database.pharmacies.remove(deletePharmacy);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
