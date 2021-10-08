package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.TrainingStoreDao;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;

import java.util.Collections;
import java.util.List;

public class TrainingStoreDaoImpl extends AbstractItemDao implements TrainingStoreDao {

    private static final String getAllDriversQuery =
            "SELECT {" + DriverModel.PK + "} FROM{" + DriverModel._TYPECODE + "}";
    private static final String getAllDealersQuery =
            "SELECT {" + DealerModel.PK + "} FROM{" + DealerModel._TYPECODE + "}";

    @Override
    public List<DriverModel> getAllDrivers() {
        final SearchResult<DriverModel> driverSearchResult =
                getFlexibleSearchService().search(getAllDriversQuery);
        return driverSearchResult.getResult() == null
                ? Collections.emptyList()
                : driverSearchResult.getResult();
    }

    @Override
    public List<DealerModel> getAllDealers() {
        final SearchResult<DealerModel> dealerSearchResult =
                getFlexibleSearchService().search(getAllDealersQuery);
        return dealerSearchResult.getResult() == null
                ? Collections.emptyList()
                : dealerSearchResult.getResult();
    }
}
