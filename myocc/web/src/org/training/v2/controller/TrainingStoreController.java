package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.trainingStore.DealerDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.trainingStore.DriverDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import de.hybris.training.facades.trainingStore.TrainingStoreFacade;
import de.hybris.training.queues.data.DealerDataList;
import de.hybris.training.queues.data.DriverDataList;
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
@RequestMapping(value = "/")
@Api(tags = "Training Store")
public class TrainingStoreController extends BaseController {

    @Resource(name = "trainingStoreFacade")
    private TrainingStoreFacade trainingStoreFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllDrivers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(
            nickname = "getAllDrivers",
            value = "Get all driver details",
            notes = "Returns details of all drivers",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    public DriverDataListWSDTO getAllDrivers(
            @ApiParam(
                    value =
                            "Response Configuration. This is the list of list of fields that should be returned in the response body",
                    allowableValues = "BASIC,DEFAULT,FULL")
            @ApiFieldsParam
            @RequestParam(defaultValue = DEFAULT_FIELD_SET)
            final String fields) {
        final DriverDataList driverDataList = new DriverDataList();
        driverDataList.setDrivers(trainingStoreFacade.getAllDrivers());
        return getDataMapper().map(driverDataList, DriverDataListWSDTO.class, fields);
    }

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllDealers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(
            nickname = "getAllDealers",
            value = "Get all dealer details",
            notes = "Returns details of all dealers",
            authorizations = {@Authorization(value = "oauth2_client_credentials")})
    public DealerDataListWSDTO getAllDealers(
            @ApiParam(
                    value =
                            "Response Configuration. This is the list of list of fields that should be returned in the response body",
                    allowableValues = "BASIC,DEFAULT,FULL")
            @ApiFieldsParam
            @RequestParam(defaultValue = DEFAULT_FIELD_SET)
            final String fields) {
        final DealerDataList dealerDataList = new DealerDataList();
        dealerDataList.setDealers(trainingStoreFacade.getAllDealers());
        return getDataMapper().map(dealerDataList, DealerDataListWSDTO.class, fields);
    }
}
