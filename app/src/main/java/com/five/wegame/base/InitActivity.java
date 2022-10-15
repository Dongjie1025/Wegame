package com.five.wegame.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public abstract class InitActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
        initListener();
    }

    // 获取布局id
    protected abstract int getLayoutId();
    // 初始化控件
    protected abstract void initView();
    // 初始化数据
    protected abstract void initData();
    // 初始化事件
    protected abstract void initListener();

}
