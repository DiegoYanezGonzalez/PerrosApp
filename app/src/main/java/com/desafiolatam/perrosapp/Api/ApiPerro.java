package com.desafiolatam.perrosapp.Api;

import com.desafiolatam.perrosapp.model.BreedImageListResponse;
import com.desafiolatam.perrosapp.model.BreedListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiPerro {

    // se daclaran metodos
    //para la lista
    @GET("api/breeds/list/") // obtiene los datos
    Call <BreedListResponse> getBreedList();



    //para las imagenes
    @GET("api/breed/{breed}/images/")
    Call <BreedImageListResponse> getBreedImageList(@Path("breed")String breed);

}
