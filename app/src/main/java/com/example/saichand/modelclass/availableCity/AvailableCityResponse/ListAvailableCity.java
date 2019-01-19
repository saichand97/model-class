package com.example.saichand.modelclass.availableCity.AvailableCityResponse;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class ListAvailableCity implements Serializable {


    @SerializedName("availableCities")
    ArrayList<AvailableCity> availableCities;

    @SerializedName("current_city")
    AvailableCity current_city;

    @SerializedName("delivery_cities")
    ArrayList<DeliveryCities> delivery_cities;

    @SerializedName("wallet_cities")
    ArrayList<WalletCities> wallet_cities;


    public ArrayList<AvailableCity> getAvailableCities() {
        return availableCities;
    }

    public void setAvailableCities(ArrayList<AvailableCity> availableCities) {
        this.availableCities = availableCities;
    }

    public ArrayList<DeliveryCities> getDelivery_cities() {
        return delivery_cities;
    }

    public void setDelivery_cities(ArrayList<DeliveryCities> delivery_cities) {
        this.delivery_cities = delivery_cities;
    }

    public ArrayList<WalletCities> getWallet_cities() {
        return wallet_cities;
    }

    public void setWallet_cities(ArrayList<WalletCities> wallet_cities) {
        this.wallet_cities = wallet_cities;
    }

    public AvailableCity getCurrent_city() {
        return current_city;
    }

    public void setCurrent_city(AvailableCity current_city) {
        this.current_city = current_city;
    }
}
