package com.mediastep.beecow.catalog.client;

import com.mediastep.beecow.catalog.dto.*;
import com.mediastep.beecow.common.config.BeecowFeignClientConfig;
import com.mediastep.beecow.common.dto.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The interface Catalog service client.
 */
@FeignClient(name = "catalogServices", fallback = CatalogServiceClientFallback.class, configuration = BeecowFeignClientConfig.class)
public interface CatalogServiceClient {

    /**
     * Gets city.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the city
     */
    @RequestMapping(value = "/api/city/{code}", method = RequestMethod.GET)
    CitySimpleDTO getCity(@RequestHeader("Authorization") String jwtToken, @PathVariable("code") String code);

    /**
     * Gets ward.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the ward
     * @deprecated use <code>getDistrictByCode</code>
     */
    @RequestMapping(value = "/api/ward/{code}", method = RequestMethod.GET)
    @Deprecated
    WardDTO getWard(@RequestHeader("Authorization") String jwtToken, @PathVariable("code") String code);

    /**
     * Gets ward by id.
     *
     * @param jwtToken the jwt token
     * @param id       the id
     * @return the ward by id
     * @deprecated use <code>getDistrictById</code>
     */
    @RequestMapping(value = "/api/wards/{id}", method = RequestMethod.GET)
    @Deprecated
    WardDTO getWardById(@RequestHeader("Authorization") String jwtToken, @PathVariable("id") Long id);

    /**
     * Gets all terms.
     *
     * @param jwtToken the jwt token
     * @param taxonomy the taxonomy
     * @param level    the level
     * @return the all terms
     */
    @RequestMapping(value = "/api/terms", method = RequestMethod.GET)
    List<TermDTO> getAllTerms(@RequestHeader("Authorization") String jwtToken, @RequestParam(required = false, value = "taxonomy") String taxonomy,
                              @RequestParam(required = false, value = "level") Integer level);

    /**
     * Gets all terms and chidren.
     *
     * @param jwtToken the jwt token
     * @param taxonomy the taxonomy
     * @param metadata the metadata
     * @return the all terms and chidren
     */
    @RequestMapping(value = "/api/terms/tree", method = RequestMethod.GET)
    List<TermDTO> getAllTermsAndChidren(@RequestHeader("Authorization") String jwtToken, @RequestParam(required = false, value = "taxonomy") String taxonomy,
            @RequestParam(required = false, value = "metadata") String metadata);

    /**
     * Gets district by code.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the district by code
     */
    @RequestMapping(value = "/api/districts/code/{code}", method = RequestMethod.GET)
    DistrictDTO getDistrictByCode(@RequestHeader("Authorization") String jwtToken, @PathVariable("code") String code);

    /**
     * Gets district by id.
     *
     * @param jwtToken the jwt token
     * @param id       the id
     * @return the district by id
     */
    @RequestMapping(value = "/api/districts/{id}", method = RequestMethod.GET)
    DistrictDTO getDistrictById(@RequestHeader("Authorization") String jwtToken, @PathVariable("id") Long id);

    /**
     * Gets ward.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the ward
     */
    @RequestMapping(value = "/api/wards/code/{code}", method = RequestMethod.GET)
    WardNewDTO getWardNew(@RequestHeader("Authorization") String jwtToken, @PathVariable("code") String code);

    /**
     * Gets ward by id.
     *
     * @param jwtToken the jwt token
     * @param id       the id
     * @return the ward by id
     */
    @RequestMapping(value = "/api/wards/new/{id}", method = RequestMethod.GET)
    WardNewDTO getWardByIdNew(@RequestHeader("Authorization") String jwtToken, @PathVariable("id") Long id);

    @RequestMapping(value = "/api/country/{countryCode}/cities/tree", method = RequestMethod.GET)
    List<CityTreeDTO> getCityTreeByCountryCode(@PathVariable("countryCode") String countryCode, @RequestHeader("Authorization") String jwtToken);

    @RequestMapping(value = "/api/countries/get-symbol-by-currency-code/{currencyCode}", method = RequestMethod.GET)
    String getSymbolByCurrencyCode(@RequestHeader("Authorization") String jwtToken, @PathVariable("currencyCode") String currencyCode);

    @RequestMapping(value = "/api/countries/code/{code}", method = RequestMethod.GET)
    CountryDTO getCountryByCode(@RequestHeader("Authorization") String jwtToken, @PathVariable("code") String code);

}
