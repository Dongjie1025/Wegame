package com.five.wegame.activities;

import androidx.fragment.app.Fragment;

import com.five.wegame.base.BasicActivity;
import com.five.wegame.fragments.SettingFragment;

public class SettingActivity extends BasicActivity {

    @Override
    protected Fragment addFragment() {
        return new SettingFragment();
    }
}
