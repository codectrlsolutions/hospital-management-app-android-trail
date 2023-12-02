package com.example.hospitalmanagementsystem;

import java.io.Serializable;

public class ItemsCategories implements Serializable {
    String doctor_name;
    String doctor_specialization;
    String doctor_description;
    String doctor_services;

    int doctor_image;

    public ItemsCategories(String doctor_name, String doctor_specialization, String doctor_description,
                           String doctor_services, int doctor_image) {
        this.doctor_name = doctor_name;
        this.doctor_specialization = doctor_specialization;
        this.doctor_description = doctor_description;
        this.doctor_services = doctor_services;
        this.doctor_image = doctor_image;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_specialization() {
        return doctor_specialization;
    }

    public void setDoctor_specialization(String doctor_specialization) {
        this.doctor_specialization = doctor_specialization;
    }

    public String getDoctor_description() {
        return doctor_description;
    }

    public void setDoctor_description(String doctor_description) {
        this.doctor_description = doctor_description;
    }

    public String getDoctor_services() {
        return doctor_services;
    }

    public void setDoctor_services(String doctor_services) {
        this.doctor_services = doctor_services;
    }

    public int getDoctor_image() {
        return doctor_image;
    }

    public void setDoctor_image(int doctor_image) {
        this.doctor_image = doctor_image;
    }
}
