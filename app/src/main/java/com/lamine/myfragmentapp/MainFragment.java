package com.lamine.myfragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener{

    public MainFragment () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
       View result = inflater.inflate (R.layout.fragment_main, container, false);
       result.findViewById (R.id.fragment_main_button).setOnClickListener (this);
       return result;
    }


    @Override
    public void onClick (View v) {

    }
}
