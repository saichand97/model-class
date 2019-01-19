package com.example.saichand.modelclass.availableCity.AvailableCityRequest;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RequestAvailableCities implements Serializable {
    @SerializedName("available")
    boolean available;


    @SerializedName("lat_lng")
    String lat_lng;

    @SerializedName("delivery_available")
    boolean delivery_available;

    @SerializedName("wallet_available")
    boolean wallet_available;




    public void setLat_lng(String lat_lng) {
        this.lat_lng = lat_lng;
    }

    public void setWallet_available(boolean wallet_available) {
        this.wallet_available = wallet_available;
    }

    public void setDelivery_available(boolean delivery_available) {
        this.delivery_available = delivery_available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
