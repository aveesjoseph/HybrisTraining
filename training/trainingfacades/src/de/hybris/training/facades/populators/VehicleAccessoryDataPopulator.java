package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.VehicleAccessoryProductModel;
import de.hybris.training.facades.product.data.VehicleAccessoryProductData;

public class VehicleAccessoryDataPopulator
        implements Populator<VehicleAccessoryProductModel, VehicleAccessoryProductData> {
    @Override
    public void populate(VehicleAccessoryProductModel source, VehicleAccessoryProductData target)
            throws ConversionException {
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setAccessoryBrandName(source.getAccessoryBrandName());
    }
}
