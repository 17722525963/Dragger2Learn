package com.zsrun.dragger2learn.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zsrun.dragger2learn.R;
import com.zsrun.dragger2learn.entity.BaseEntity;

import java.util.List;

/**
 * 2018/7/19 10:59
 *
 * @author zsr
 * @version 1.0
 */

public class GanksAdapter<T extends BaseEntity> extends BaseQuickAdapter<T, BaseViewHolder> {

    public GanksAdapter(int layoutResId, @Nullable List<T> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, T item) {
        helper.setText(R.id.who, item.getWho())
                .setText(R.id.desc, item.getDesc())
                .setText(R.id.type, item.getType())
                .setText(R.id.created, item.getCreatedAt());
    }

}

