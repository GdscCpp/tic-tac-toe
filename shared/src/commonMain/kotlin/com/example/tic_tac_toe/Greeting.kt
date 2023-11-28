package com.example.tic_tac_toe
import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"

        return "$firstWord\nGuess what it is! > ${platform.name.reversed()}!"
    }
}

expect interface Platform {
    val name: String
}