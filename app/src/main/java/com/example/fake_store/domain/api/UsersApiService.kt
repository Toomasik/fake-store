package com.example.fake_store.domain.api

import com.example.fake_store.domain.resopnses.UserResponce
import retrofit2.http.GET

interface UsersApiService {
    @GET("/api/v1/users")
    suspend fun get_users(): List<UserResponce>
}