package com.company;

public class AbstractLocality {
    private String name;
    private int population ;

    public AbstractLocality(String nameOfDistrict, String headOfDistrict) {
        this.headOfDistrict = headOfDistrict;
        this.nameOfDistrict = nameOfDistrict;


    }

    public String getNameOfDistrict() {
        return nameOfDistrict;
    }

    public void setNameOfDistrict(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    public String getHeadOfDistrict() {
        return headOfDistrict;
    }

    public void setHeadOfDistrict(String headOfDistrict) {
        this.headOfDistrict = headOfDistrict;
    }

    public void searchHeadOfDistrict();

    public void live(){
        System.out.println(headOfDistrict);
    }


}
