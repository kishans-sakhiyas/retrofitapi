package com.example.retrofitsapis;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("team")
    private String superName;
    public Results(String name) {
        this.superName = name;
    }

    public String getName() {
        return superName;
    }
}
