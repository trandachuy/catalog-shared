package com.mediastep.beecow.catalog.dto;

import com.mediastep.beecow.common.dto.ImageDTO;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CountrySimpleDTO implements ILocation {

    private Long id;

    private String code;

    private String inCountry;

    private String outCountry;

    private ImageDTO flag;

    private int phoneCode;

    private String currencyCode;

    private String currencySymbol;
}
