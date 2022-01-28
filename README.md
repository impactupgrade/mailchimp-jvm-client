# MailChimp JVM Client

COMING SOON!

mailchimp-jvm-client is a direct fork of [MaleOrang](https://github.com/Ecwid/maleorang), which was itself a replacement for [ecwid-mailchimp](https://github.com/Ecwid/ecwid-mailchimp/). We ([Impact Upgrade](https://www.impactupgrade.com)) will be further investing in the project as a part of the [Nonprofit Nucleus](https://www.impactupgrade.com/nonprofit-nucleus/) engine. However, we'd love to rebuild the community that was previously behind the Ecwid projects!

## Impact Upgrade

[Impact Upgrade](https://www.impactupgrade.com) is a tech and operations consulting company that solely partners with nonprofits and for-good businesses. We make the complex simple, focusing on back-office operations and making big ideas a reality. Don't fight a multiple-front battle! You know your mission. We know tech.

## General info

mailchimp-jvm-client provides access to [MailChimp API v3.0](http://developer.mailchimp.com/documentation/mailchimp/reference/overview/) methods from Kotlin/Java code. It is written in [Kotlin language](https://kotlinlang.org/) and can be used with any language which runs on JVM. Refer to the [javadoc pages](http://www.javadoc.io/doc/com.ecwid/maleorang/) for details.

## Supported MailChimp API methods

Currently mailchimp-jvm-client has wrappers for a limited number of MailChimp API methods, namely:
* [Members methods](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/)
* [Batch Operations methods](http://developer.mailchimp.com/documentation/mailchimp/reference/batches/)
* Some of [Lists methods](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/)

However, it is easy to extend the API and add support for any method you need (see the samples below).

## Code samples

* [Using an existing method implementation (Java)](src/test/java/com/ecwid/maleorang/examples/ExistingMethodExample.java)
* [Using an existing method implementation (Kotlin)](src/test/java/com/ecwid/maleorang/method/v3_0/lists/members/MembersTest.kt)
* [Using a custom method implementation (Java)](src/test/java/com/ecwid/maleorang/examples/CustomMethodExample.java)

## Build tools integration

mailchimp-jvm-client is accessible from Maven Central so it can be easily integrated with your favorite build tools like Gradle or Maven.
