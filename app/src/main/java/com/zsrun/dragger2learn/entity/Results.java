package com.zsrun.dragger2learn.entity;

import java.util.List;

/**
 * 2018/7/19 9:16
 *
 * @author zsr
 * @version 1.0
 */

public class Results {

    private List<Android> Android;
    private List<IOS> iOS;
    private List<休息视频> 休息视频;
    private List<拓展资源> 拓展资源;
    private List<瞎推荐> 瞎推荐;
    private List<福利> 福利;

    public List<com.zsrun.dragger2learn.entity.Android> getAndroid() {
        return Android;
    }

    public void setAndroid(List<com.zsrun.dragger2learn.entity.Android> android) {
        Android = android;
    }

    public List<IOS> getiOS() {
        return iOS;
    }

    public void setiOS(List<IOS> iOS) {
        this.iOS = iOS;
    }

    public List<com.zsrun.dragger2learn.entity.休息视频> get休息视频() {
        return 休息视频;
    }

    public void set休息视频(List<com.zsrun.dragger2learn.entity.休息视频> 休息视频) {
        this.休息视频 = 休息视频;
    }

    public List<com.zsrun.dragger2learn.entity.拓展资源> get拓展资源() {
        return 拓展资源;
    }

    public void set拓展资源(List<com.zsrun.dragger2learn.entity.拓展资源> 拓展资源) {
        this.拓展资源 = 拓展资源;
    }

    public List<com.zsrun.dragger2learn.entity.瞎推荐> get瞎推荐() {
        return 瞎推荐;
    }

    public void set瞎推荐(List<com.zsrun.dragger2learn.entity.瞎推荐> 瞎推荐) {
        this.瞎推荐 = 瞎推荐;
    }

    public List<com.zsrun.dragger2learn.entity.福利> get福利() {
        return 福利;
    }

    public void set福利(List<com.zsrun.dragger2learn.entity.福利> 福利) {
        this.福利 = 福利;
    }
}
