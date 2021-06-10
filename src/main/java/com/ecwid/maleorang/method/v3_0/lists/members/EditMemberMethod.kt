package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import org.apache.commons.codec.digest.DigestUtils
import java.util.*
import kotlin.collections.ArrayList

/**
 * Base class for member create or update operations.
 */
sealed class EditMemberMethod : MailchimpMethod<MemberInfo>() {
    /**
     * [Add a new list member](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#create-post_lists_list_id_members)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/lists/{list_id}/members")
    class Create(
            @JvmField
            @PathParam
            val list_id: String,

            @JvmField
            @Field
            val email_address: String
    ) : EditMemberMethod()

    /**
     * [Update a list member](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#edit-patch_lists_list_id_members_subscriber_hash)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}")
    class Update(
            @JvmField
            @PathParam
            val list_id: String,

            email_address: String
    ) : EditMemberMethod() {
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email_address.toLowerCase())
    }

    /**
     * [Add or update a list member](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#edit-put_lists_list_id_members_subscriber_hash)
     */
    @Method(httpMethod = HttpMethod.PUT, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}")
    class CreateOrUpdate(
            @JvmField
            @PathParam
            val list_id: String,

            @JvmField
            @Field
            val email_address: String
    ) : EditMemberMethod() {
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email_address.toLowerCase())

        @JvmField
        @Field
        var status_if_new: String? = null
    }
    /**
     * [Add or Remove a Member's tag](https://mailchimp.com/developer/marketing/api/list-member-tags/add-or-remove-member-tags/)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}/tags")
    class AddorRemoveTag(
        @JvmField
        @PathParam
        val list_id: String,

        email_address: String
    ) : EditMemberMethod() {
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email_address.toLowerCase())

        @JvmField
        @PathParam
        val is_syncing: Boolean? = false;
    }

    @JvmField
    @Field
    var id: String? = null

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
    var _links: ArrayList<MailchimpObject>? = null
}