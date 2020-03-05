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

    //2 - Declare callback
    private OnButtonClickedListener mCallback;

    // 1 - Declare our interface that will be implemented by any container activity
    public interface OnButtonClickedListener {
        public void onButtonClicked(View view);
    }

    public MainFragment () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        //Inflate the layout of MainFragment
        View result=inflater.inflate(R.layout.fragment_main, container, false);
        //Set onClickListener to button "SHOW ME DETAILS"
        result.findViewById(R.id.fragment_main_button).setOnClickListener(this);

        return result;
    }


    @Override
    public void onClick (View v) {

    }
}
