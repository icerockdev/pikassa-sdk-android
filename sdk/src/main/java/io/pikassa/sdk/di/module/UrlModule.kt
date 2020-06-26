package io.pikassa.sdk.di.module

import dagger.Module
import dagger.Provides

/**
Created by Denis Chornyy on 26,Июнь,2020
All rights received.
 */
@Module
class UrlModule {
    @Provides
    fun provideUrl() = "https://pikassa.io/merchant-api/api/v2/"
}