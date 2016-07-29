package com.example.toralipse.apptest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by toralipse on 2016/07/27.
 */
public class MyAdapter extends ArrayAdapter<Item> {
    public MyAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(getContext(),R.layout.row_example,null);
        }
        Item item = getItem(position);

        TextView name = (TextView)convertView.findViewById(R.id.row_example_name);
        TextView url = (TextView)convertView.findViewById(R.id.row_example_url);

        name.setText(item.name);
        url.setText(item.url);
        return convertView;
    }
}
