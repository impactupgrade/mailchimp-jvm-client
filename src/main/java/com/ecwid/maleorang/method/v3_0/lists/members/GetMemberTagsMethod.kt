package com.ecwid.maleorang.method.v3_0.lists.members


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Get information about a specific list members tag](https://mailchimp.com/developer/marketing/api/list-member-tags/list-member-tags/)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}/tags")
class GetMemberTagsMethod(
    @JvmField
    @PathParam
    val list_id: String,

    email: String
) : MailchimpMethod<MemberInfo>() {
    @JvmField
    @PathParam
    val subscriber_hash: String = DigestUtils.md5Hex(email.toLowerCase())

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    @JvmField
    @QueryStringParam
    var count: Int? = null;

    @JvmField
    @QueryStringParam
    var offset: Int? = null;
}