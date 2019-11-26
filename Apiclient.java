package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient
{

    public static  final String BASE_URL="http://vyasprakruti.000webhostapp.com";
   static Retrofit retrofit=null;
    public static Retrofit getapiclinet()
    {
            if(retrofit==null)
            {
                retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }

         return  retrofit;
    }


}
