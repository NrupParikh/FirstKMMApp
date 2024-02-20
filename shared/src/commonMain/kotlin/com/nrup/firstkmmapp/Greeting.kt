package com.nrup.firstkmmapp

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

//    fun greet(): String {
//        return "Hello, ${platform.name}!"
//    }

    fun greet(): List<String> = buildList {
        add("Title ${platform.name}")
        add("Description ${platform.name.reversed()}")
    }
}