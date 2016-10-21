package com.androidedu.example.mydiary;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by user on 2016-10-21.
 */

public class MyListAdapter extends BaseAdapter
{
    private boolean bCheckMode = false;
    ArrayList<String> dataList = new ArrayList<String>();
    LayoutInflater inflater = null;

    public MyListAdapter(LayoutInflater inflater)
    {
        this.inflater = inflater;

        dataList.add("테스트 1");
        dataList.add("테스트 2");
        dataList.add("테스트 3");
        dataList.add("테스트 4");
        dataList.add("테스트 5");
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Log.d("LIST","getView = "+position);
        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.activity_list_listitem, null, false);
        }

        CheckBox checkBox = (CheckBox)convertView.findViewById(R.id.checkBox);

        if(bCheckMode == true)
        {
            checkBox.setVisibility(View.VISIBLE);
        }
        else
        {
            checkBox.setVisibility(View.GONE);
        }
        return convertView;
    }

    public void setCheckMode(boolean value)
    {
        bCheckMode = value;
    }

}
