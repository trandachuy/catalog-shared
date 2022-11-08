package com.mediastep.beecow.catalog.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDTO implements Serializable {
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String adminArea1;
    private String adminArea2;
    private String adminArea3;
    private String adminArea4;
    private String countryCode;
    private String postalCode;
}
