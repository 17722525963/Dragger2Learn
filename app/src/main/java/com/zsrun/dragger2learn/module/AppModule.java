package com.zsrun.dragger2learn.module;

import com.zsrun.dragger2learn.api.Api;
import com.zsrun.dragger2learn.global.Global;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 2018/7/19 9:32
 *
 * @author zsr
 * @version 1.0
 */

@Module
public class AppModule {

    public AppModule() {

    }

    @Singleton
    @Provides
    Api providersApi(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }

    @Singleton
    @Provides
    Retrofit providerRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Global.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
