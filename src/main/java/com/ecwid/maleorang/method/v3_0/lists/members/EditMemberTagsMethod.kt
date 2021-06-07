package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import org.apache.commons.codec.digest.DigestUtils
import java.util.*

/**
 * Base class for tag Add or Remove Methods
 */
sealed class EditMemberTagsMethod : MailchimpMethod<MemberInfo>() {
    /**
     * [Add a new tag](https://mailchimp.com/developer/marketing/api/list-member-tags/)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}/tags")
    class AddOrRemove(
        @JvmField
        @PathParam
        val list_id: String,

        @JvmField
        @Field
        val email_address: String
    ) : EditMemberTagsMethod(){
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email_address.toLowerCase())
    }

    @JvmField
    @Field
    var tags: MailchimpObject? = null;

    @JvmField
    @Field
    var is_syncing: Boolean? = null

}