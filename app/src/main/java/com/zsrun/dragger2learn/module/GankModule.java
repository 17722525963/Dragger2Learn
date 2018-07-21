package com.zsrun.dragger2learn.module;

import com.zsrun.dragger2learn.R;
import com.zsrun.dragger2learn.adapter.GanksAdapter;
import com.zsrun.dragger2learn.api.Api;
import com.zsrun.dragger2learn.entity.Android;
import com.zsrun.dragger2learn.global.Global;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 2018/7/19 9:26
 *
 * @author zsr
 * @version 1.0
 */

//@Module(includes = AppModule.class) 可以在这里通过这种方式引入其他Module （方式一） ；第二种方法 是在conpoment 中进行引用
@Module
public class GankModule {

    @Provides
    GanksAdapter<Android> providerAdapter(List<Android> data) {
        return new GanksAdapter<>(R.layout.item_layout, data);
    }

    @Provides
    List<Android> providerDatas() {
        return new ArrayList<>();
    }

}
