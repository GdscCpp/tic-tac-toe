package com.example.tic_tac_toe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform