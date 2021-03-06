package com.elitedevelopers.weathertoday.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mobile App Develop on 6-8-16.
 */
public class Clouds {

    @SerializedName("all")
    @Expose
    private Integer all;

    /**
     * @return The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * @param all The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }
}
