package com.nrup.firstkmmapp

import android.icu.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DateTimeApi actual constructor() {
    actual fun getCurrentDateTime(): String {
        val date = Date(System.currentTimeMillis())
        val dateFormat = SimpleDateFormat("dd/MMM/yyyy HH:MM:SS", Locale.getDefault())
        return  dateFormat.format(date)
    }
}