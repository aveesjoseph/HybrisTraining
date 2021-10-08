package de.hybris.training.facades.trainingStore;

import de.hybris.training.facades.product.data.DealerData;
import de.hybris.training.facades.product.data.DriverData;

import java.util.List;

public interface TrainingStoreFacade {
    public List<DriverData> getAllDrivers();
    public List<DealerData> getAllDealers();
}
