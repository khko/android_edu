package com.androidedu.example.mydiary;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class FullscreenActivity extends AppCompatActivity {

    ProgressBar progressBar = null;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            progressBar.setProgress(90);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().addFlags(FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);

        ActionBar actionBar = this.getSupportActionBar();
        actionBar.hide();

        progressBar = (ProgressBar)this.findViewById(R.id.progressBar);

        handler.sendEmptyMessageDelayed(0, 1000);
    }
}
