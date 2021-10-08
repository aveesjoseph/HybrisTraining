package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.facades.product.data.DriverData;

public class DriverProductPopulator implements Populator<DriverModel, DriverData> {
    @Override
    public void populate(DriverModel source, DriverData target) throws ConversionException {
        target.setDriverId(source.getDriverId());
        target.setName(source.getName());
        target.setExperience(source.getExperience());
    }
}
