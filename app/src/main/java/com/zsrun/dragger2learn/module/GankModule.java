package com.zsrun.dragger2learn.module;

import com.zsrun.dragger2learn.R;
import com.zsrun.dragger2learn.adapter.GanksAdapter;
import com.zsrun.dragger2learn.entity.Android;
import com.zsrun.dragger2learn.entity.IOS;
import com.zsrun.dragger2learn.scope.MyScope;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * 2018/7/19 9:26
 *
 * @author zsr
 * @version 1.0
 */

@Module
public class GankModule {

    @MyScope
    @Provides
    GanksAdapter<Android> providerAdapter(List<Android> data) {
        return new GanksAdapter<>(R.layout.item_layout, data);
    }

    @Provides
    List<Android> providerDatas() {
        return new ArrayList<>();
    }


}
