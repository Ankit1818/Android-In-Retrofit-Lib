package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface Apiinterface
{
    @POST("/file/view_without_var1.php")
    Call<List<Data>>calldata();
}
