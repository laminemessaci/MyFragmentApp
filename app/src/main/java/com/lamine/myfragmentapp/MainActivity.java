package com.lamine.myfragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MainFragment.OnButtonClickedListener {

    // 1 - Declare main fragment
    private MainFragment mainFragment;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        // 2 - Configure and show home fragment
        this.configureAndShowMainFragment();


    }


    @Override
    public void onButtonClicked (View view) {
        Log.e (getClass ().getSimpleName (), " Button Clicked :))!!");

        startActivity(new Intent (this, DetailsActivity.class));
    }

    // --------------
    // FRAGMENTS
    // --------------

    private void configureAndShowMainFragment(){

        // A - Get FragmentManager (Support) and Try to find existing instance of fragment in FrameLayout container
        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.frame_layout_main);

        if (mainFragment == null) {
            // B - Create new main fragment
            mainFragment = new MainFragment();
            // C - Add it to FrameLayout container
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_layout_main, mainFragment)
                    .commit();
        }
    }
}
