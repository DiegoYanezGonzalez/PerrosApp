package com.desafiolatam.perrosapp.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ApiRetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://dog.ceo/";

    public static Retrofit getRetrofit(){
        if (retrofit==null){
            retrofit= new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
