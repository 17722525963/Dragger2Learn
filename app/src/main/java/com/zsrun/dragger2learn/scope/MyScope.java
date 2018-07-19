package com.zsrun.dragger2learn.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 2018/7/19 9:52
 * 个人理解 Scope 就是进行唯一标识
 * Singleton 也只是作用于当前Component 并不是全局都是单例模式
 *
 * @author zsr
 * @version 1.0
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface MyScope {
}
