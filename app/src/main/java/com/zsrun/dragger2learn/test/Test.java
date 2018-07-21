package com.zsrun.dragger2learn.test;

import android.util.Log;

import javax.inject.Inject;

public class Test {

    @Inject
    public Test() {
        Log.i("???", "Test: 这是我用来测试的一个类~ ");
    }

    @Override
    public String toString() {
        return "测试 toString()";
    }
}
