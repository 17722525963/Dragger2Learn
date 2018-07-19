package com.zsrun.dragger2learn.component;

import com.zsrun.dragger2learn.MainActivity;
import com.zsrun.dragger2learn.module.AppModule;
import com.zsrun.dragger2learn.module.GankModule;
import com.zsrun.dragger2learn.scope.MyScope;

import dagger.Component;

/**
 * 2018/7/19 9:27
 *
 * @author zsr
 * @version 1.0
 */

@MyScope
@Component(modules = {GankModule.class, AppModule.class})
public interface GanksComponent {

    void inject(MainActivity mainActivity);

}
