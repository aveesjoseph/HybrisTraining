package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class VehicleProductPopulator extends SearchResultVariantProductPopulator {
    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);
        if (null != this.<Integer>getValue(source, "registrationNo")) {
            target.setRegistrationNo(this.<Integer>getValue(source, "registrationNo"));
            target.setDealerName(this.<String>getValue(source, "dealerName"));
            target.setDriverName(this.<String>getValue(source, "driverName"));
        }
    }
}
