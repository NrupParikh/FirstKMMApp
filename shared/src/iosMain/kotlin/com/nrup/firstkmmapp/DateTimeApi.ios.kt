package com.nrup.firstkmmapp

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DateTimeApi actual constructor() {
    actual fun getCurrentDateTime(): String {
        val date = NSDate.dateWithTimeIntervalSince1970(NSDate.date().timeIntervalSince1970().toLong())
        val dateFormatter = NSDateFormatter().apply {
            dateFormat = "dd/MMM/yyyy HH:mm:ss"
            locale = NSLocale.currentLocale
        }
        return dateFormatter.stringFromDate(date)
    }
}