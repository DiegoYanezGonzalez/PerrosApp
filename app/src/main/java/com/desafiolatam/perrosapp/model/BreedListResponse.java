package com.desafiolatam.perrosapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BreedListResponse {
//POJO Transferencia de String , Lista de perros
    @SerializedName("message")
    private String status;
    private List<String> breedList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getBreedList() {
        return breedList;
    }

    public void setBreedList(List<String> breedList) {
        this.breedList = breedList;
    }

}
