package com.noker.logos.experiment

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform