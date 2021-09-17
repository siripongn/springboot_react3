package com.student.testing;

import javax.persistence.Entity;

@Entity
public class Province {

    private int PROVINCE_ID;
    private int PROVINCE_CODE;
    private String PROVINCE_NAME;
    private String PROVINCE_NAME_ENG;


    public Province() {
    }



    public int getPROVINCE_ID() {
        return this.PROVINCE_ID;
    }

    public void setPROVINCE_ID(int PROVINCE_ID) {
        this.PROVINCE_ID = PROVINCE_ID;
    }

    public int getPROVINCE_CODE() {
        return this.PROVINCE_CODE;
    }

    public void setPROVINCE_CODE(int PROVINCE_CODE) {
        this.PROVINCE_CODE = PROVINCE_CODE;
    }

    public String getPROVINCE_NAME() {
        return this.PROVINCE_NAME;
    }

    public void setPROVINCE_NAME(String PROVINCE_NAME) {
        this.PROVINCE_NAME = PROVINCE_NAME;
    }

    public String getPROVINCE_NAME_ENG() {
        return this.PROVINCE_NAME_ENG;
    }

    public void setPROVINCE_NAME_ENG(String PROVINCE_NAME_ENG) {
        this.PROVINCE_NAME_ENG = PROVINCE_NAME_ENG;
    }

    
}
