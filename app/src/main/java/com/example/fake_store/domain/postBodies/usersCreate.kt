package com.example.fake_store.domain.postBodies

data class usersCreate(
    val avatar: String = "https://api.lorem.space/image/movie?w=150&h=220",
    val email: String,
    val name: String,
    val password: String
)