package com.five.wegame.activities;

import androidx.fragment.app.Fragment;

import com.five.wegame.base.BasicActivity;
import com.five.wegame.fragments.HomeFragment;

public class HomeActivity extends BasicActivity {

    @Override
    protected Fragment addFragment() {
        return new HomeFragment();
    }

}
