package com.mediastep.beecow.catalog.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PackageCurrencyDTO implements Serializable {
    
    private Long id;

    private String currencyCode;

    private String symbol;

    private BigDecimal exchangeRateVN;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getExchangeRateVN() {
        return exchangeRateVN;
    }

    public void setExchangeRateVN(BigDecimal exchangeRateVN) {
        this.exchangeRateVN = exchangeRateVN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageCurrencyDTO)) {
            return false;
        }

        return id != null && id.equals(((PackageCurrencyDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PackageCurrencyDTO{" +
            "id=" + getId() +
            ", currencyCode='" + getCurrencyCode() + "'" +
            ", symbol='" + getSymbol() + "'" +
            ", exchangeRateVN=" + getExchangeRateVN() +
            "}";
    }
}
