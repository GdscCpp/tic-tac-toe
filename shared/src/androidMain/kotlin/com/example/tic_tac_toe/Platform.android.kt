package com.example.tic_tac_toe

import android.os.Build

class AndroidPlatform: Platform {
    override val name: String =
        "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()