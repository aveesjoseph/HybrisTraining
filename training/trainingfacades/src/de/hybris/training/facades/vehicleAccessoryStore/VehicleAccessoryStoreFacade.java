package de.hybris.training.facades.vehicleAccessoryStore;

import de.hybris.training.facades.product.data.SupportedVehicleData;
import de.hybris.training.facades.product.data.VehicleAccessoryProductData;

import java.util.List;

public interface VehicleAccessoryStoreFacade {
    public List<SupportedVehicleData> getAllSupportedVehicles();
    public List<VehicleAccessoryProductData> getAllAccessoryProducts();
}
