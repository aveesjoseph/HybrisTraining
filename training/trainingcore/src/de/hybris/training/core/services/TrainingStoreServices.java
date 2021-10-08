package de.hybris.training.core.services;

import de.hybris.training.core.dao.TrainingStoreDao;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;

import javax.annotation.Resource;
import java.util.List;

public class TrainingStoreServices {

    @Resource private TrainingStoreDao trainingStoreDao;

    public TrainingStoreServices(TrainingStoreDao trainingStoreDao) {
        this.trainingStoreDao = trainingStoreDao;
    }

    public List<DriverModel> getAllDrivers() {
        return trainingStoreDao.getAllDrivers();
    }

    public List<DealerModel> getAllDealers() {
        return trainingStoreDao.getAllDealers();
    }
}
