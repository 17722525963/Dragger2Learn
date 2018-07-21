package com.zsrun.dragger2learn.component;


import com.zsrun.dragger2learn.BaseApp;
import com.zsrun.dragger2learn.api.Api;
import com.zsrun.dragger2learn.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(BaseApp baseApp);

    Api getApi();

    Retrofit getRetrofit();

}
