package com.oscarcasarezruiz.wearsensorfingerprinting.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.oscarcasarezruiz.wearsensorfingerprinting.R;

public class FirstInstructionFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first_instruction, container, false);
        return view;
    }
}