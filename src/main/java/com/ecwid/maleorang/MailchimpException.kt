package com.ecwid.maleorang

/**
 * Indicates a MailChimp API error.
 */
class MailchimpException(
        @JvmField
        val code: Int,

        @JvmField
        val description: String,

        @JvmField
        val errors: List<String>? = null
) : Exception("API Error ($code): $description")
