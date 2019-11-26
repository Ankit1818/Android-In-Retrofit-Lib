package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Data
{
    @SerializedName("statename")
    String statename;


    @SerializedName("countryname")
    String countryname;

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
