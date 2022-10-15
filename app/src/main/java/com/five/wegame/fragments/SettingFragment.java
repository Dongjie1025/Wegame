package com.five.wegame.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.five.wegame.R;
import com.five.wegame.activities.SettingActivity;
import com.five.wegame.base.BaseFragment;
import com.five.wegame.base.BasicActivity;

public class SettingFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(requireContext(), "size == " + ((SettingActivity)requireActivity()).getSupportFragmentManager().getFragments().size(), Toast.LENGTH_SHORT).show();
    }
}
