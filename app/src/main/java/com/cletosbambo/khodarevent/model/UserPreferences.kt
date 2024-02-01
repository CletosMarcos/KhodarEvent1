package com.cletosbambo.khodarevent.model

import kotlinx.serialization.Serializable

@Serializable
data class UserPreferences(
    val accessToken: String = "",
    val communityEmail: String = ""
)