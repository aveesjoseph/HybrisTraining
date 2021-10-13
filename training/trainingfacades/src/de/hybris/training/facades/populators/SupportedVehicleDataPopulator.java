package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.facades.product.data.SupportedVehicleData;

public class SupportedVehicleDataPopulator
        implements Populator<SupportedVehicleModel, SupportedVehicleData> {
    @Override
    public void populate(SupportedVehicleModel source, SupportedVehicleData target)
            throws ConversionException {
        target.setCode(source.getCode());
        target.setVehicleName(source.getVehicleName());
        target.setVariant(source.getVariant());
    }
}
