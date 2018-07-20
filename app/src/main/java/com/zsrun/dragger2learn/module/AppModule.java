package com.zsrun.dragger2learn.module;

import android.content.Context;

import com.zsrun.dragger2learn.api.Api;
import com.zsrun.dragger2learn.global.Global;
import com.zsrun.dragger2learn.scope.MyScope;

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

    private Context mContext;

    public AppModule(Context mContext) {
        this.mContext = mContext;
    }

    @MyScope
    @Provides
    Retrofit providerRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Global.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @MyScope
    @Provides
    Api providersApi(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }


    @Provides
    Context providerContext() {
        return this.mContext;
    }

}
