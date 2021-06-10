package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field
import java.util.*

class MemberInfo : MailchimpObject() {
    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var unique_email_id: String? = null

    @JvmField
    @Field
    var full_name: String? = null

    @JvmField
    @Field
    var web_id: Int? = null

    @JvmField
    @Field
    var email_type: String? = null

    @JvmField
    @Field
    var status: String? = null

    @JvmField
    @Field
    var unsubscribe_reason: String? = null

    @JvmField
    @Field
    var merge_fields: MailchimpObject? = null

    @JvmField
    @Field
    var interests: MailchimpObject? = null

    @JvmField
    @Field
    var stats: MailchimpObject? = null

    @JvmField
    @Field
    var ip_signup: String? = null

    @JvmField
    @Field
    var timestamp_signup: Date? = null

    @JvmField
    @Field
    var ip_opt: String? = null

    @JvmField
    @Field
    var timestamp_opt: Date? = null

    @JvmField
    @Field
    var member_rating: Int? = null

    @JvmField
    @Field
    var last_changed: Date? = null

    @JvmField
    @Field
    var language: String? = null

    @JvmField
    @Field
    var vip: Boolean? = null

    @JvmField
    @Field
    var email_client: String? = null

    @JvmField
    @Field
    var location: MailchimpObject? = null

    @JvmField
    @Field
    var marketing_permissions: MailchimpObject? = null

    @JvmField
    @Field
    var last_note: MailchimpObject? = null

    @JvmField
    @Field
    var source: String? = null

    @JvmField
    @Field
    var tags_count: Int? = null

    @JvmField
    @Field
    var tags: ArrayList<MailchimpObject>? = null

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var _links: ArrayList<MailchimpObject>? = null


}
