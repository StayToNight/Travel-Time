package com.travel.time

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform