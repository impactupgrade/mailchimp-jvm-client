package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import java.util.*

@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/segments/{segment_id}/members")
class GetSegmentMembersMethod (
    @JvmField
    @PathParam
    val list_id: String,
    val segment_id: String
    ) : MailchimpMethod<GetSegmentMembersMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    @JvmField
    @QueryStringParam
    var count: Int? = null

    @JvmField
    @QueryStringParam
    var offset: Int? = null

    @JvmField
    @QueryStringParam
    var email_type: String? = null

    @JvmField
    @QueryStringParam
    var status: String? = null

    @JvmField
    @QueryStringParam
    var since_timestamp_opt: Date? = null

    @JvmField
    @QueryStringParam
    var before_timestamp_opt: Date? = null

    @JvmField
    @QueryStringParam
    var since_last_changed: Date? = null

    @JvmField
    @QueryStringParam
    var before_last_changed: Date? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var members: List<MemberInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}