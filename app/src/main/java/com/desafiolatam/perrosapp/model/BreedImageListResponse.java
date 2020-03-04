package com.desafiolatam.perrosapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
//clase POJO para traer imagenes com string"url"
public class BreedImageListResponse {

    @SerializedName("message")
    private List<String> imageUrl;
    private String status;

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
