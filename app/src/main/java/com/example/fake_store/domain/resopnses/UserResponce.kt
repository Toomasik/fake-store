package com.example.fake_store.domain.resopnses

import com.google.gson.annotations.SerializedName

data class UserResponce (
    @SerializedName("id"         ) var id         : Int?    = null,
    @SerializedName("email"      ) var email      : String? = null,
    @SerializedName("password"   ) var password   : String? = null,
    @SerializedName("name"       ) var name       : String? = null,
    @SerializedName("role"       ) var role       : String? = null,
    @SerializedName("avatar"     ) var avatar     : String? = null,
    @SerializedName("creationAt" ) var creationAt : String? = null,
    @SerializedName("updatedAt"  ) var updatedAt  : String? = null
)
