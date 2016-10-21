package com.androidedu.example.mydiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFullScreen = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // git hub 테스트

        btnFullScreen = (Button)this.findViewById(R.id.btnFullScreen);

        btnFullScreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onClickedBtnFullScreenStart(v);
            }
        });
    }

    public void onClickedBtnListStart(View v)
    {
        Intent intent = new Intent(this, ListActivity.class);
        this.startActivity(intent);
    }

    public void onClickedBtnEditStart(View v)
    {
        Intent intent = new Intent(this, EditActivity.class);
        this.startActivity(intent);
    }

    public void onClickedBtnFullScreenStart(View v)
    {
        Intent intent = new Intent(this, FullscreenActivity.class);
        this.startActivity(intent);
    }

    public void onClickedBtnPopupStart(View v)
    {

    }
}
