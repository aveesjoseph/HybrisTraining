package de.hybris.training.facades.trainingStore.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.core.services.TrainingStoreServices;
import de.hybris.training.facades.product.data.DealerData;
import de.hybris.training.facades.product.data.DriverData;
import de.hybris.training.facades.trainingStore.TrainingStoreFacade;

import java.util.List;

public class TrainingStoreFacadeImpl implements TrainingStoreFacade {

    private TrainingStoreServices trainingStoreService;
    private Converter<DriverModel, DriverData> driverConverter;
    private Converter<DealerModel, DealerData> dealerConverter;

    @Override
    public List<DriverData> getAllDrivers() {
        final List<DriverModel> driverModel = trainingStoreService.getAllDrivers();
        return Converters.convertAll(driverModel, getDriverConverter());
    }

    @Override
    public List<DealerData> getAllDealers() {
        final List<DealerModel> dealerModel = trainingStoreService.getAllDealers();
        return Converters.convertAll(dealerModel, getDealerConverter());
    }

    public TrainingStoreServices getTrainingStoreService() {
        return trainingStoreService;
    }

    public void setTrainingStoreService(TrainingStoreServices trainingStoreService) {
        this.trainingStoreService = trainingStoreService;
    }

    public Converter<DriverModel, DriverData> getDriverConverter() {
        return driverConverter;
    }

    public Converter<DealerModel, DealerData> getDealerConverter() {
        return dealerConverter;
    }

    public void setDealerConverter(Converter<DealerModel, DealerData> dealerConverter) {
        this.dealerConverter = dealerConverter;
    }

    public void setDriverConverter(Converter<DriverModel, DriverData> driverConverter) {
        this.driverConverter = driverConverter;
    }
}
