package com.gooker.kotlin.base.github

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GitHubService {

    @GET("repos/ReactiveX/RxJava/stargazers")
    fun starCount(): Call<List<GitHubUser>>

}


object Service {
    val gitHubService: GitHubService by lazy {
        Retrofit.Builder().baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(GitHubService::class.java)
    }

}

fun main(args: Array<String>) {

//    Service.gitHubService.starCount().execute().body()?.map {
//        println(it)
//    }

    Service.gitHubService.starCount().enqueue(object : Callback<List<GitHubUser>> {
        override fun onFailure(call: Call<List<GitHubUser>>?, t: Throwable?) {
            println(t?.message)
        }

        override fun onResponse(call: Call<List<GitHubUser>>?, response: Response<List<GitHubUser>>?) {
            response?.body()?.map {
                println(it)
            }
        }
    });
}