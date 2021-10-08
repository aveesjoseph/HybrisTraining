package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.facades.product.data.DealerData;

public class DealerProductPopulator implements Populator<DealerModel, DealerData> {
    @Override
    public void populate(DealerModel source, DealerData target) throws ConversionException {
        target.setDealerId(source.getDealerId());
        target.setName(source.getName());
    }
}
