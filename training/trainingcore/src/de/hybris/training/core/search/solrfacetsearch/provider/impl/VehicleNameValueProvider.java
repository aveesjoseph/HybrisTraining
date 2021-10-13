package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.training.core.model.SupportedVehicleModel;
import de.hybris.training.core.model.VehicleAccessoryProductModel;
import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VehicleNameValueProvider implements FieldValueProvider, Serializable {
    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(
            final IndexConfig indexConfig, final IndexedProperty indexedProperty, final Object model)
            throws FieldValueProviderException {
        if (model instanceof VehicleAccessoryProductModel) {
            final VehicleAccessoryProductModel vehicleAccessoryProductModel =
                    (VehicleAccessoryProductModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();

            fieldValues.addAll(createFieldValue(vehicleAccessoryProductModel, indexedProperty));

            return fieldValues;
        } else {
            return Collections.emptyList();
        }
    }

    private Collection<? extends FieldValue> createFieldValue(
            final VehicleAccessoryProductModel vehicleAccessoryProductModel,
            final IndexedProperty indexedProperty) {
        final List<FieldValue> fieldValues = new ArrayList<>();

        final String vehicleName = getVehicleName(vehicleAccessoryProductModel);

        if (null != vehicleName) {
            addFieldValues(fieldValues, indexedProperty, vehicleName);
        }
        return fieldValues;
    }

    private String getVehicleName(VehicleAccessoryProductModel vehicleAccessoryProductModel) {
        final Collection<SupportedVehicleModel> supportedVehicles =
                vehicleAccessoryProductModel.getSupportedVehicles();
        String vehicleName = null;
        for (final SupportedVehicleModel supportedVehicle : supportedVehicles) {
            vehicleName =
                    supportedVehicle.getVehicleName().concat("-").concat(supportedVehicle.getVariant());
        }
        return vehicleName;
    }

    private void addFieldValues(
            List<FieldValue> fieldValues, IndexedProperty indexedProperty, Object value) {
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames) {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    @Required
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }
}
