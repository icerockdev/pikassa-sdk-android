package io.pikassa.sample.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

/**
Created by pikassa, support@pikassa.io on 26,Июнь,2020
All rights received.
 */

@Module
class HttpClientModule {
    @Provides
    fun provideHttpClientModule(headers: List<Pair<String, String>>): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .addInterceptor {
                val request = it.request().newBuilder()
                for (pair in headers) {
                    request.header(pair.first, pair.second)
                }
                it.proceed(request.build())
            }
    }
}