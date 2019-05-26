![build-badge](https://travis-ci.org/raleighlittles/My-First-App.svg?branch=master)

# Background

The purpose of this project was to familiarize myself with how to get automated Google Play publishing setup.


# About

The actual Android application here is described in the "Build your first app" example on the [developer.android.com](https://developer.android.com/training/basics/firstapp) page.

# CI/CD strategy

This project uses Travis CI, and relies on the [Gradle Play Publisher](https://github.com/Triple-T/gradle-play-publisher) plugin to automatically created a signed APK, and then publish it.

The Gradle Play Publisher plugin internally utilizes the Google Play Developer API.

On each commit, a signed APK is created, and then published. 



<a href='https://play.google.com/store/apps/details?id=com.raleigh.myfirstapp&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png'/></a>
