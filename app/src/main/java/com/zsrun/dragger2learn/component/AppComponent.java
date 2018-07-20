package com.zsrun.dragger2learn.component;

import com.zsrun.dragger2learn.BaseApp;
import com.zsrun.dragger2learn.module.AppModule;
import com.zsrun.dragger2learn.scope.MyScope;

import dagger.Component;

/**
 * 2018/7/19 9:32
 *
 * @author zsr
 * @version 1.0
 */

@MyScope
@Component(modules = AppModule.class)
public interface AppComponent {


}
