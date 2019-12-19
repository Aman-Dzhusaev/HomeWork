package com.company;

public class NewYork extends AbstractLocality {
    public NewYork(String headOfDistrict){
        super(headOfDistrict);

    }

    @Override
    public void searchHeadOfDistrict(){
        System.out.println("head of New York district");
    }


}
