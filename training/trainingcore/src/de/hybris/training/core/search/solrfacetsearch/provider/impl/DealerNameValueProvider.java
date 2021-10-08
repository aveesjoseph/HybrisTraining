package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.VehicleModel;
import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DealerNameValueProvider implements FieldValueProvider, Serializable {
    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(
            final IndexConfig indexConfig, final IndexedProperty indexedProperty, final Object model)
            throws FieldValueProviderException {

        if (model instanceof VehicleModel) {
            final VehicleModel vehicleModel = (VehicleModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();

            fieldValues.addAll(createFieldValue(vehicleModel, indexedProperty));

            return fieldValues;
        } else {
            return Collections.emptyList();
        }
    }

    private List<FieldValue> createFieldValue(
            final VehicleModel vehicleModel, final IndexedProperty indexedProperty) {
        final List<FieldValue> fieldValues = new ArrayList<>();

        final String dealerName = getDealerName(vehicleModel);

        if (null != dealerName) {
            addFieldValues(fieldValues, indexedProperty, dealerName);
        }
        return fieldValues;
    }

    private void addFieldValues(
            final List<FieldValue> fieldValues,
            final IndexedProperty indexedProperty,
            final Object value) {
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames) {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    private String getDealerName(VehicleModel vehicleModel) {
        final Collection<DealerModel> dealers = vehicleModel.getDealers();
        String dealerName = null;
        for (final DealerModel dealer : dealers) {
            dealerName = dealer.getName();
        }
        return dealerName;
    }

    @Required
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }
}
