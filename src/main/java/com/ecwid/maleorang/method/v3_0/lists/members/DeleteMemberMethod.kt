package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Archive a list member](https://mailchimp.com/developer/api/marketing/list-members/archive-list-member/)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}")
class DeleteMemberMethod(
        @JvmField
        @PathParam
        val list_id: String,

        email: String
) : MailchimpMethod<MailchimpObject>() {
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email.toLowerCase())
}
