package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class VehicleAccessoryProductPopulator extends SearchResultVariantProductPopulator {
    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);

        if (null != this.<String>getValue(source, "code")) {
            target.setCode(this.<String>getValue(source, "code"));
            target.setSupportedVehicleName(this.<String>getValue(source, "vehicleName"));
            target.setAccessoryBrandName(this.<String>getValue(source, "accessoryBrandName"));
        }
    }
}
