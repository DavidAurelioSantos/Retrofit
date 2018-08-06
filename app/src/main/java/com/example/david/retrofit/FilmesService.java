package com.example.david.retrofit;

import com.example.david.retrofit.models.FilmesCatalogo;
import com.example.david.retrofit.models.Results;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FilmesService {

    @GET("/4sblo")
    Call<List<Results>> listCatalogo();
}
