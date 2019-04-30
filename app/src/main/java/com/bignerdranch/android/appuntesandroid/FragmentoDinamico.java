package com.bignerdranch.android.appuntesandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import org.jetbrains.annotations.NotNull;

public class FragmentoDinamico extends Fragment {

    public FragmentoDinamico() {

    }

    //realizar Login

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view =inflater.inflate(R.layout.fragment_dinamico, container, false);

        return view;
    }
}
