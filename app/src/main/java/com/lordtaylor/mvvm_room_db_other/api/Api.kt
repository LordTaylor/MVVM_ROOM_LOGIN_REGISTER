package com.lordtaylor.mvvm_room_db_other.api

import com.google.gson.GsonBuilder
import com.lordtaylor.mvvm_room_db_other.utils.Constance
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface Api {

    @GET("/private")
    fun getPrivateData(@Header("Authorization") auth: String, @Query("access_token") token: String): Observable<String>


    @POST("/oauth/token")
    @FormUrlEncoded
    fun getToken(
        @Header("Authorization") au: String, @Field("grant_type") grant_type: String, @Field("username") username: String, @Field(
            "password"
        ) password: String
    ): Observable<TokenResponse>

    companion object {
        fun create(): Api {
            val gson = GsonBuilder()
                .setLenient()
                .create()
            val retrofit = retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(Constance.BASE_URL)
                .build()
            return retrofit.create(Api::class.java)
        }
    }

}