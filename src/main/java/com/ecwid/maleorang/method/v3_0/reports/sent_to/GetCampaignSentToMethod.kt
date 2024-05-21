package com.ecwid.maleorang.method.v3_0.reports.sent_to

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*

/**
 * [Get a list of a campaign's recipients](https://mailchimp.com/developer/marketing/api/sent-to-reports/list-campaign-recipients/)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/reports/{campaign_id}/sent-to")
class GetCampaignSentToMethod(@JvmField @PathParam val campaign_id: String) : MailchimpMethod<GetCampaignSentToMethod.Response>() {

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

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var sent_to: List<SentToInfo>? = null

        @JvmField
        @Field
        var campaign_id: String? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }

}
