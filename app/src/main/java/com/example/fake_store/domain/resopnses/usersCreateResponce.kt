package com.example.fake_store.domain.resopnses

data class usersCreateResponce(
    val avatar: String,
    val creationAt: String,
    val email: String,
    val id: Int,
    val name: String,
    val password: String,
    val role: String,
    val updatedAt: String
)