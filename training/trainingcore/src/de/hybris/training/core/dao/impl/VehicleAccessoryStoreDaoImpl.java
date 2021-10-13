package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.VehicleAccessoryStoreDao;
import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.core.model.VehicleAccessoryProductModel;
import de.hybris.training.core.model.VehicleAccessoryStyleVariantProductModel;

import java.util.Collections;
import java.util.List;

public class VehicleAccessoryStoreDaoImpl extends AbstractItemDao
        implements VehicleAccessoryStoreDao {
    private static final String getAllSupportedVehiclesQuery =
            "SELECT {" + SupportedVehicleModel.PK + "} FROM{" + SupportedVehicleModel._TYPECODE + "}";
    private static final String getAllAccessoryProducts =
            "SELECT {" + VehicleAccessoryProductModel.PK + "} FROM{" + VehicleAccessoryProductModel._TYPECODE + "}";

    @Override
    public List<SupportedVehicleModel> getAllSupportedVehicles() {
        final SearchResult<SupportedVehicleModel> supportedVehicleSearchResult =
                getFlexibleSearchService().search(getAllSupportedVehiclesQuery);

        return supportedVehicleSearchResult.getResult() == null
                ? Collections.emptyList()
                : supportedVehicleSearchResult.getResult();
    }

    @Override
    public List<VehicleAccessoryProductModel> getAllAccessoryProducts() {
        System.out.println("hit here");
        final SearchResult<VehicleAccessoryProductModel> accessoryProductSearchResult =
                getFlexibleSearchService().search(getAllAccessoryProducts);

        return accessoryProductSearchResult.getResult() == null
                ? Collections.emptyList()
                : accessoryProductSearchResult.getResult();
    }
}
