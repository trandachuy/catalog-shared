package com.mediastep.beecow.catalog.response;

import com.mediastep.beecow.catalog.dto.*;
import com.mediastep.beecow.catalog.util.AddressUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type City tree dto.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

    private static final long serialVersionUID = 1L;

    private CountrySimpleDTO country;

    private CitySimpleDTO city;

    private DistrictDTO district;

    private WardNewDTO ward;

    public String getFullAddress(String address, AddressUtil.OptionalAddressFields optionalFields) {
        return AddressUtil.buildAddressWithCountry(country, city, district, ward, address, optionalFields);
    }

}
