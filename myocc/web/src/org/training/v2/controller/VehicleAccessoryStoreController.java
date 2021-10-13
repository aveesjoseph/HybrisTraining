package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.trainingStore.SupportedVehicleDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.trainingStore.VehicleAccessoryProductDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import de.hybris.training.facades.vehicleAccessoryStore.VehicleAccessoryStoreFacade;
import de.hybris.training.queues.data.SupportedVehicleDataList;
import de.hybris.training.queues.data.VehicleAccessoryProductDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/{baseSiteId}/vehicleAccessoryStore/")
@Api(tags = "Vehicle Accessory Store")
public class VehicleAccessoryStoreController extends BaseController {

    @Resource(name = "vehicleAccessoryStoreFacade")
    private VehicleAccessoryStoreFacade vehicleAccessoryStoreFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllSupportedVehicles", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(
            nickname = "getAllSupportedVehicles",
            value = "Get all Accessory Supported Vehicle List nd their details",
            notes = "Get all Accessory Supported Vehicle List nd their details",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public SupportedVehicleDataListWSDTO getAllSupportedVehicles(
            @ApiParam(
                    value =
                            "Response Configuration. This is the list of list of fields that should be returned in the response body",
                    allowableValues = "BASIC,DEFAULT,FULL")
            @ApiFieldsParam
            @RequestParam(defaultValue = DEFAULT_FIELD_SET)
            final String fields) {
        final SupportedVehicleDataList supportedVehicleDataList = new SupportedVehicleDataList();
        supportedVehicleDataList.setVehicles(vehicleAccessoryStoreFacade.getAllSupportedVehicles());
        return getDataMapper()
                .map(supportedVehicleDataList, SupportedVehicleDataListWSDTO.class, fields);
    }

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllAccessoryProducts", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(
            nickname = "getAllAccessoryProducts",
            value = "Get all accessories",
            notes = "Get all accessories",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public VehicleAccessoryProductDataListWSDTO getAllAccessoryProducts(
            @ApiParam(
                    value =
                            "Response Configuration. This is the list of list of fields that should be returned in the response body",
                    allowableValues = "BASIC,DEFAULT,FULL")
            @ApiFieldsParam
            @RequestParam(defaultValue = DEFAULT_FIELD_SET)
            final String fields) {
        final VehicleAccessoryProductDataList vehicleAccessoryProductDataList =
                new VehicleAccessoryProductDataList();
        vehicleAccessoryProductDataList.setAccessories(
                vehicleAccessoryStoreFacade.getAllAccessoryProducts());
        return getDataMapper()
                .map(vehicleAccessoryProductDataList, VehicleAccessoryProductDataListWSDTO.class, fields);
    }
}
