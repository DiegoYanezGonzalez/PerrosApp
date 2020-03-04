package com.desafiolatam.perrosapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.desafiolatam.perrosapp.Api.ApiPerro;
import com.desafiolatam.perrosapp.Api.ApiRetrofitClient;
import com.desafiolatam.perrosapp.model.BreedListResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

public String perro1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ApiPerro api = ApiRetrofitClient.getRetrofit().create(ApiPerro.class);
        Call<BreedListResponse> call = api.getBreedList();
        call.enqueue(new Callback<BreedListResponse>() {
            @Override
            public void onResponse(Call<BreedListResponse> call, Response<BreedListResponse> response) {
                 //capturando datos de la api getbreedList en caso de exito
                //creando lista donde guardar los datos capturados
                List<String> perritos = response.body().getBreedList();
                //guardando el primer perro de la lista
                perro1 =perritos.get(0);
                Log.i("perritos",String.valueOf(perritos));
            }
            @Override
            public void onFailure(Call<BreedListResponse> call, Throwable t) {
//en caso de falla muestra un mensaje de error
                Toast.makeText(MainActivity.this, "FALLO, intentelo otra vez", Toast.LENGTH_SHORT).show();
                Log.e("PERRITOS", String.valueOf(t));
            }});
    }
   }
