package com.izzed.ndelokmovie11.data.api

import com.izzed.ndelokmovie11.data.model.ListResponse
import com.izzed.ndelokmovie11.data.model.MovieResponse
import com.izzed.ndelokmovie11.data.model.TvShowResponse
import com.izzed.ndelokmovie11.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}