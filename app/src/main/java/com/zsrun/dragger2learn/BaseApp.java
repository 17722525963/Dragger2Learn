package com.zsrun.dragger2learn;

import android.app.Application;
import android.util.Log;

import com.zsrun.dragger2learn.component.AppComponent;
import com.zsrun.dragger2learn.component.DaggerAppComponent;
import com.zsrun.dragger2learn.component.DaggerGanksComponent;
import com.zsrun.dragger2learn.module.AppModule;
import com.zsrun.dragger2learn.module.GankModule;
import com.zsrun.dragger2learn.test.Test;

import javax.inject.Inject;

/**
 * 2018/7/20 10:32
 *
 * @author zsr
 * @version 1.0
 */

public class BaseApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();

        appComponent.inject(this);

        initView();
    }

    private void initView() {

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
