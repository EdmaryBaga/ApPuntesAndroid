package com.bignerdranch.android.appuntesandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

public class FragmentoPrincipal extends Fragment {

    //1 añadimos el constructor vacio
    public FragmentoPrincipal() {


    }

    //2 sobreescribimos el metodo onCreateView, que infla la vista perteneciente a este fragment
    //De esta forma se conecta al xml
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_principal, container, false);
    }
}
