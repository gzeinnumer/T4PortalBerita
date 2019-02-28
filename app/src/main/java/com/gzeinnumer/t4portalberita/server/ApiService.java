package com.gzeinnumer.t4portalberita.server;

import com.gzeinnumer.t4portalberita.model.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("tampil_berita.php")
    Call<ResponseBerita> getAllBerita();

}
