package com.example.david.retrofit.models;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ConfiguradorRetrofit {

        public static Retrofit retrofit;
        public static final String BASE_URL = "https://api.myjson.com/bins/";

        public static Retrofit getRetrofitInstance() {
            if (retrofit == null){
                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(JacksonConverterFactory.create()).build();

            }
            return retrofit;
        }

}
