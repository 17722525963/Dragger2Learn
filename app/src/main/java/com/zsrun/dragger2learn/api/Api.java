package com.zsrun.dragger2learn.api;

import com.zsrun.dragger2learn.entity.Ganks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 2018/7/19 9:21
 *
 * @author zsr
 * @version 1.0
 */

public interface Api {

    @GET("day/{year}/{month}/{day}")
    Call<Ganks> getGanks(@Path("year") String year, @Path("month") String month, @Path("day") String day);

}
