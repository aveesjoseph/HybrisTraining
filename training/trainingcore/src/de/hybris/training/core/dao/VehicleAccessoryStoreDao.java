package de.hybris.training.core.dao;

import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.core.model.VehicleAccessoryProductModel;
import de.hybris.training.core.model.VehicleAccessoryStyleVariantProductModel;

import java.util.List;

public interface VehicleAccessoryStoreDao {
    List<SupportedVehicleModel> getAllSupportedVehicles();
    List<VehicleAccessoryProductModel> getAllAccessoryProducts();
}
