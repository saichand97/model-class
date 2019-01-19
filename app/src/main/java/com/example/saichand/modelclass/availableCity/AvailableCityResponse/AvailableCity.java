package com.example.saichand.modelclass.availableCity.AvailableCityResponse;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class AvailableCity implements Serializable {

    @SerializedName("id")
    int id;

    @SerializedName("name")
    String name;

    @SerializedName("gps")
    String gps;

    @SerializedName("is_available")
    boolean is_available;

    @SerializedName("is_wallet_city")
    boolean is_wallet_city;

    @SerializedName("state_short_name")
    String state_short_name;


    public int getId() {
        return id;
    }



    public String getGps() {
        return gps;
    }



    public String getState_short_name() {
        return state_short_name;
    }



}
