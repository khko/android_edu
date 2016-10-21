package com.androidedu.example.mydiary;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().addFlags(FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);

        ActionBar actionBar = this.getSupportActionBar();
        actionBar.hide();


    }
}
