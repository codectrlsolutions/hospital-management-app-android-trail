package com.example.hospitalmanagementsystem;

import java.util.ArrayList;

public class Constants {

    static String description = "A Physician is a highly qualified medical professional who examines patients, diagnoses illnesses, prescribes medications, and provides comprehensive medical care to promote health and well-being";
    static String services = "listen to patients carefully to understand the disease symptoms.\n" +
            "perform a diagnosis to find the cause of illness.\n" +
            "prescribe medication and administer treatments based on the diagnosis.\n" +
            "perform general examination and order blood tests and procedures to understand a patient's ailment or illness.";
    // This Method create an Doctors Arraylist and return the Arraylist
    public static ArrayList<ItemsCategories> getDoctorsData() {
        // create an ArrayList of type ItemsCategories
        ArrayList<ItemsCategories> doctors_list = new ArrayList<>();

        doctors_list.add(new ItemsCategories("John wick","Cardiologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Robert j","Dermatologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("James Gunn","Neurologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Ricky tales","Orthopedic Surgeon",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Micky mose","Gynecologist/Obstetrician",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Pick War","Pediatrician",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Leg piece","Psychiatrist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Apple Mac","Oncologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("John wick","Endocrinologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Robert j","Gastroenterologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("James Gunn","Orthopedic Surgeon",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Ricky tales","Orthopedic Surgeon",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Micky mose","Cardiologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Pick War","Pediatrician",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Leg piece","Gastroenterologist",description,services,R.drawable.doctor));
        doctors_list.add(new ItemsCategories("Apple Mac","Cardiologist",description,services,R.drawable.doctor));

        return doctors_list;
    }
}
