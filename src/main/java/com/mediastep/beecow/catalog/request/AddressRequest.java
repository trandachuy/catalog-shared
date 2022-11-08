package com.mediastep.beecow.catalog.request;

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
public class AddressRequest {

    private static final long serialVersionUID = 1L;

    private String countryCode;

    private String cityCode;

    private String districtCode;

    private String wardCode;

}
