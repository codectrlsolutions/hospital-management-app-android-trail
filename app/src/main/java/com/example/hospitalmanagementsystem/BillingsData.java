package com.example.hospitalmanagementsystem;

import java.util.ArrayList;

public class BillingsData {

    public static ArrayList<ItemsBilling> getBillingsData(){
        ArrayList<ItemsBilling> billingArrayList = new ArrayList<>();

        billingArrayList.add(new ItemsBilling("ramulu","ramulu123","ii123",
                "available","card","paid","avilable",
                "10"));
        billingArrayList.add(new ItemsBilling("jain","jain123","i123",
                "available1","card1","paid1","avilable1",
                "1"));
        billingArrayList.add(new ItemsBilling("dev","dev123","ii123",
                "available","card","paid","avilable",
                "10"));
        billingArrayList.add(new ItemsBilling("abc","abc123","abcii123",
                "abc available","abc card","abc paid","abc avilable",
                "abc 10"));

        return billingArrayList;
    }
}
