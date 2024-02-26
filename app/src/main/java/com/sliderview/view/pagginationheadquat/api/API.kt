package com.sliderview.view.pagginationheadquat.api

import com.sliderview.view.pagginationheadquat.model.ResponseTopMovies
import com.sliderview.view.pagginationheadquat.utils.API_KEY
import com.sliderview.view.pagginationheadquat.utils.APP_LANGUAGE
import com.sliderview.view.pagginationheadquat.utils.MOVIE_TOP_RATED_API
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/*
Created date :- 22-02-24
   This
 */

interface API {
    @GET(MOVIE_TOP_RATED_API)
    fun getTopRatedMovies(@Query("api_key") apikey : String = API_KEY
                         ,@Query("language") language: String = APP_LANGUAGE
                         ,@Query("page")pageIndex: Int) : Call<ResponseTopMovies>
}