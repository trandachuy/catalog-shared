package com.mediastep.beecow.catalog.dto;

import java.io.Serializable;

public class BankInfoDTO implements Serializable {

    private Long id;

    private String bankName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BankInfoDTO)) {
            return false;
        }

        return id != null && id.equals(((BankInfoDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BankInfoDTO{" +
                "id=" + getId() +
                ", bankName='" + getBankName() + "'" +
                "}";
    }
}
