package com.nrup.firstkmmapp

interface Platform {
    val name: String
}

/*
The expect keyword provides a declaration of the API that will be implemented
using platform-specific libraries.

To provide definitions for these specific platforms, we use actual modifier.
The compiler will ensure that all APIs with expect keyword in the signature have corresponding
actual definitions in the binary
See in AndroidPlatform class in androidMain or IOSPlatform in iosMain in shared folder
*/
expect fun getPlatform(): Platform