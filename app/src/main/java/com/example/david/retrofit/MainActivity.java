package com.example.david.retrofit;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.david.retrofit.models.ConfiguradorRetrofit;
import com.example.david.retrofit.models.DavidAdapter;
import com.example.david.retrofit.models.FilmesCatalogo;
import com.example.david.retrofit.models.Results;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DavidAdapter davidAdapter;

    private static final String TAG = "David" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FilmesService service = ConfiguradorRetrofit.getRetrofitInstance().create(FilmesService.class);
        Call<List<Results>> requestCatalogo = service.listCatalogo();

        requestCatalogo.enqueue(new Callback<List<Results>>() {
            @Override
            public void onResponse(Call<List<Results>> call, Response<List<Results>> response) {
                configuradorRecycleView(response.body());
                Log.i(TAG,"Deu certo");
            }

            @Override
            public void onFailure(Call<List<Results>> call, Throwable t) {
                Log.e(TAG,"Deu muito ruim" + t.getMessage());
            }
      });

    }
    private void configuradorRecycleView(List<Results> lista ){
        recyclerView = findViewById(R.id.RView);
        davidAdapter = new DavidAdapter(this,lista);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(davidAdapter);

    }

}
