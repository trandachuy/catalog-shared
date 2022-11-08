package com.mediastep.beecow.catalog.client;

import com.mediastep.beecow.catalog.dto.*;
import com.mediastep.beecow.common.dto.CountryDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Catalog service client fallback.
 */
@Component
public class CatalogServiceClientFallback implements CatalogServiceClient {

    @Override
    public CitySimpleDTO getCity(String code, String jwtToken) {
        CitySimpleDTO citySimpleDTO = new CitySimpleDTO();
        citySimpleDTO.setCode(code);
        citySimpleDTO.setInCountry(code);
        citySimpleDTO.setOutCountry(code);
        return citySimpleDTO;
    }

    @Override
    public WardDTO getWard(String code, String jwtToken) {
        return createWard(null, code);
    }

    @Override
    public WardDTO getWardById(String jwtToken, Long id) {
        return createWard(id, String.valueOf(id));
    }

    @Override
    public List<TermDTO> getAllTerms(String jwtToken, String taxonomy, Integer level) {
        return new ArrayList<>();
    }

    @Override
    public List<TermDTO> getAllTermsAndChidren(String jwtToken, String taxonomy, String metadata) {
        return new ArrayList<>();
    }

    /**
     * Gets district by code.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the district by code
     */
    @Override
    public DistrictDTO getDistrictByCode(String jwtToken, String code) {
        return DistrictDTO.builder().code(code).inCountry(code).outCountry(code).build();
    }

    /**
     * Gets district by id.
     *
     * @param jwtToken the jwt token
     * @param id       the id
     * @return the district by id
     */
    @Override
    public DistrictDTO getDistrictById(String jwtToken, Long id) {
        return DistrictDTO.builder().code(id.toString()).inCountry(id.toString()).outCountry(id.toString()).id(id).build();
    }

    /**
     * Gets ward.
     *
     * @param jwtToken the jwt token
     * @param code     the code
     * @return the ward
     */
    @Override
    public WardNewDTO getWardNew(String jwtToken, String code) {
        return WardNewDTO.builder().code(code).inCountry(code).outCountry(code).build();
    }

    /**
     * Gets ward by id.
     *
     * @param jwtToken the jwt token
     * @param id       the id
     * @return the ward by id
     */
    @Override
    public WardNewDTO getWardByIdNew(String jwtToken, Long id) {
        return WardNewDTO.builder().code(id.toString()).inCountry(id.toString()).outCountry(id.toString()).id(id).build();
    }

    @Override
    public List<CityTreeDTO> getCityTreeByCountryCode(String countryCode, String jwtToken) {
        return null;
    }

    @Override
    public String getSymbolByCurrencyCode(String jwtToken, String currencyCode) {
        return null;
    }

    @Override
    public CountryDTO getCountryByCode(String jwtToken, String code) {
        return null;
    }

    @Deprecated
    private WardDTO createWard(Long id, String code) {
        WardDTO wardDTO = new WardDTO();
        wardDTO.setId(id);
        wardDTO.setCode(code);
        wardDTO.setInCountry(code);
        wardDTO.setOutCountry(code);
        return wardDTO;
    }
}
