package com.example.hospitalmanagementsystem;

public class ItemsBilling {
    String patient_name;
    String billing_details;
    String insurance_information;
    String payment_information;
    String payment_method;
    String payment_status;
    String general_reports;
    String discounts_and_promotions;

    public ItemsBilling(String patient_name, String billing_details,
                        String insurance_information, String payment_information,
                        String payment_method, String payment_status,
                        String general_reports, String discounts_and_promotions) {
        this.patient_name = patient_name;
        this.billing_details = billing_details;
        this.insurance_information = insurance_information;
        this.payment_information = payment_information;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
        this.general_reports = general_reports;
        this.discounts_and_promotions = discounts_and_promotions;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getBilling_details() {
        return billing_details;
    }

    public void setBilling_details(String billing_details) {
        this.billing_details = billing_details;
    }

    public String getInsurance_information() {
        return insurance_information;
    }

    public void setInsurance_information(String insurance_information) {
        this.insurance_information = insurance_information;
    }

    public String getPayment_information() {
        return payment_information;
    }

    public void setPayment_information(String payment_information) {
        this.payment_information = payment_information;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getGeneral_reports() {
        return general_reports;
    }

    public void setGeneral_reports(String general_reports) {
        this.general_reports = general_reports;
    }

    public String getDiscounts_and_promotions() {
        return discounts_and_promotions;
    }

    public void setDiscounts_and_promotions(String discounts_and_promotions) {
        this.discounts_and_promotions = discounts_and_promotions;
    }
}
