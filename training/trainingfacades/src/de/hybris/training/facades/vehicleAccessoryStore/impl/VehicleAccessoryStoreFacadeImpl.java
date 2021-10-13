package de.hybris.training.facades.vehicleAccessoryStore.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.core.model.VehicleAccessoryProductModel;
import de.hybris.training.core.services.VehicleAccessoryStoreService;
import de.hybris.training.facades.product.data.SupportedVehicleData;
import de.hybris.training.facades.product.data.VehicleAccessoryProductData;
import de.hybris.training.facades.vehicleAccessoryStore.VehicleAccessoryStoreFacade;

import java.util.List;

public class VehicleAccessoryStoreFacadeImpl implements VehicleAccessoryStoreFacade {

    private VehicleAccessoryStoreService vehicleAccessoryStoreService;
    private Converter<SupportedVehicleModel, SupportedVehicleData> supportedVehicleConverter;
    private Converter<VehicleAccessoryProductModel, VehicleAccessoryProductData>
            vehicleAccessoryProductConverter;

    @Override
    public List<SupportedVehicleData> getAllSupportedVehicles() {
        final List<SupportedVehicleModel> supportedVehicleModelList =
                vehicleAccessoryStoreService.getAllSupportedVehicles();
        return Converters.convertAll(supportedVehicleModelList, getSupportedVehicleConverter());
    }

    @Override
    public List<VehicleAccessoryProductData> getAllAccessoryProducts() {
        final List<VehicleAccessoryProductModel> vehicleAccessoryModelList =
                vehicleAccessoryStoreService.getAllAccessoryProducts();
        return Converters.convertAll(vehicleAccessoryModelList, getVehicleAccessoryProductConverter());
    }

    public VehicleAccessoryStoreService getVehicleAccessoryStoreService() {
        return vehicleAccessoryStoreService;
    }

    public void setVehicleAccessoryStoreService(
            VehicleAccessoryStoreService vehicleAccessoryStoreService) {
        this.vehicleAccessoryStoreService = vehicleAccessoryStoreService;
    }

    public Converter<SupportedVehicleModel, SupportedVehicleData> getSupportedVehicleConverter() {
        return supportedVehicleConverter;
    }

    public void setSupportedVehicleConverter(
            Converter<SupportedVehicleModel, SupportedVehicleData> supportedVehicleConverter) {
        this.supportedVehicleConverter = supportedVehicleConverter;
    }

    public Converter<VehicleAccessoryProductModel, VehicleAccessoryProductData>
    getVehicleAccessoryProductConverter() {
        return vehicleAccessoryProductConverter;
    }

    public void setVehicleAccessoryProductConverter(
            Converter<VehicleAccessoryProductModel, VehicleAccessoryProductData>
                    vehicleAccessoryProductConverter) {
        this.vehicleAccessoryProductConverter = vehicleAccessoryProductConverter;
    }
}
