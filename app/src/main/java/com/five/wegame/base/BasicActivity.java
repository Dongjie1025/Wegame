package com.five.wegame.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.five.wegame.R;
import com.five.wegame.fragments.HomeFragment;

public abstract class BasicActivity extends FragmentActivity {

    protected FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, addFragment(),"")
                .commitAllowingStateLoss();
    }

    protected abstract Fragment addFragment();

    protected void replaceFragment(Fragment fragment, String name) {
        fragmentManager.beginTransaction()
                .addToBackStack(name)
                .replace(R.id.frame_layout, fragment)
                .commitAllowingStateLoss();
    }

    protected void popFragment() {
        fragmentManager.popBackStack();
    }

    protected void popFragment(int id, int flag) {
        fragmentManager.popBackStack(id, flag);
    }

    protected void initFragmentManager(){
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout, addFragment())
                .commitAllowingStateLoss();
    }

    protected int getBasicLayoutId(){
        return R.layout.activity_basic;
    }
}
