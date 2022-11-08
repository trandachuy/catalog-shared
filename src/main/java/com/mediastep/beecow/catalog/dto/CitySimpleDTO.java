package com.mediastep.beecow.catalog.dto;

import java.io.Serializable;

/**
 * The type City simple dto.
 */
public class CitySimpleDTO implements Comparable<CitySimpleDTO>, Serializable, ILocation {
    private static final long serialVersionUID = 1L;
    private String code;
    private String inCountry;
    private String outCountry;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets in country.
     *
     * @return the in country
     */
    public String getInCountry() {
        return inCountry;
    }

    /**
     * Sets in country.
     *
     * @param inCountry the in country
     */
    public void setInCountry(String inCountry) {
        this.inCountry = inCountry;
    }

    /**
     * Gets out country.
     *
     * @return the out country
     */
    public String getOutCountry() {
        return outCountry;
    }

    /**
     * Sets out country.
     *
     * @param outCountry the out country
     */
    public void setOutCountry(String outCountry) {
        this.outCountry = outCountry;
    }

    @Override
    public int compareTo(CitySimpleDTO o) {
        return this.getOutCountry().compareTo(o.getOutCountry());
    }
}
