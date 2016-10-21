package com.androidedu.example.mydiary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listView = null;
    MyListAdapter myListAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        myListAdapter = new MyListAdapter((LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        listView = (ListView)this.findViewById(R.id.list);

        listView.setAdapter(myListAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);
        getSupportActionBar().setTitle("기타등등 일기");
    }

    @Override
    public void onBackPressed() {
        //
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        this.getMenuInflater().inflate(R.menu.activity_list_menu,menu);

        Button tv = (Button)menu.findItem(R.id.menu_next).getActionView();
        tv.setTextSize(20);
        tv.setText("다음");

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.menu_login:
                myListAdapter.setCheckMode(true);
                listView.invalidateViews();
                break;

            case android.R.id.home:
                Log.i("HOME", "HOME HOME");

        }
        return super.onOptionsItemSelected(item);
    }
}
