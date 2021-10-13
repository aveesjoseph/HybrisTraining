package de.hybris.training.core.services;

import de.hybris.training.core.dao.VehicleAccessoryStoreDao;
import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.core.model.VehicleAccessoryProductModel;

import javax.annotation.Resource;
import java.util.List;

public class VehicleAccessoryStoreService {

    @Resource private final VehicleAccessoryStoreDao vehicleAccessoryStoreDao;

    public VehicleAccessoryStoreService(VehicleAccessoryStoreDao vehicleAccessoryStoreDao) {
        this.vehicleAccessoryStoreDao = vehicleAccessoryStoreDao;
    }

    public List<SupportedVehicleModel> getAllSupportedVehicles() {
        return vehicleAccessoryStoreDao.getAllSupportedVehicles();
    }

    public List<VehicleAccessoryProductModel> getAllAccessoryProducts() {
        return vehicleAccessoryStoreDao.getAllAccessoryProducts();
    }
}
