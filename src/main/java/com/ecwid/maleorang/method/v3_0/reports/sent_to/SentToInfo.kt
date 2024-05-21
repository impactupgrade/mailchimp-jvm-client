package com.ecwid.maleorang.method.v3_0.reports.sent_to

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field
import com.google.gson.annotations.SerializedName
import java.util.*

class SentToInfo : MailchimpObject() {

    @JvmField
    @Field
    var campaign_id: String? = null

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var email_id: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var status: Status? = null

    enum class Status {
        @SerializedName("sent")
        SEND,
        @SerializedName("hard")
        HARD,
        @SerializedName("soft")
        SOFT
    }

}