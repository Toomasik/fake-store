package com.example.fake_store.domain.api

import com.example.fake_store.domain.postBodies.authLogin
import com.example.fake_store.domain.postBodies.usersCreate
import com.example.fake_store.domain.resopnses.UserResponce
import com.example.fake_store.domain.resopnses.authLoginResponce
import com.example.fake_store.domain.resopnses.usersCreateResponce
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UsersApiService {
    @GET("/api/v1/users")
    suspend fun get_users(): List<UserResponce>

    @POST("/api/v1/auth/login")
    suspend fun login(@Body authLogin: authLogin): authLoginResponce

    @POST("/api/v1/users/")
    suspend fun createUser(@Body usersCreate: usersCreate): usersCreateResponce
}