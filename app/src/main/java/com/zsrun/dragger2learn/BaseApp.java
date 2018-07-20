package com.zsrun.dragger2learn;

import android.app.Application;

/**
 * 2018/7/20 10:32
 *
 * @author zsr
 * @version 1.0
 */

public class BaseApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        initView();
    }

    private void initView() {
    }
}
