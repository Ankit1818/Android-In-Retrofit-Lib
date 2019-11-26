package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    RecyclerView listview;
    private Apiinterface apiInterface;

    private List<Data> datalist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listview = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        listview.setLayoutManager(layoutManager);


        apiInterface=Apiclient.getapiclinet().create(Apiinterface.class);
        Call<List<Data>> call = apiInterface.calldata();

        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {

                datalist  = response.body();
                CustomAdapter customAdapter = new CustomAdapter(datalist);
                listview.setAdapter(customAdapter);
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {

            }
        });


    }
}
