package com.company;

public class Moscow extends AbstractLocality {
    public Moscow (String headOfDistrict){
    super (headOfDistrict);
    }

    @Override
    public void searchHeadOfDistrict(){
        System.out.println("Head of Moscow district");
    }
}
