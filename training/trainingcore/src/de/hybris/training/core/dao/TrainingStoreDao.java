package de.hybris.training.core.dao;

import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;

import java.util.List;

public interface TrainingStoreDao {
    List<DriverModel> getAllDrivers();
    List<DealerModel> getAllDealers();
}
