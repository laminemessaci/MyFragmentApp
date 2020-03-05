package com.lamine.myfragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MainFragment.OnButtonClickedListener {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }


    @Override
    public void onButtonClicked (View view) {
        Log.e (getClass ().getSimpleName (), " Button Clicked :))!!");

        startActivity(new Intent (this, DetailsActivity.class));
    }
}
