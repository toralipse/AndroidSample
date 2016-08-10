package com.example.toralipse.apptest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by toralipse on 2016/08/10.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, List<Item> list) {
        super(context, 0 ,list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(null == convertView){
            convertView = View.inflate(getContext(),R.layout.row_item,null);
        }
        Item item = getItem(position);
        TextView name = (TextView) convertView.findViewById(R.id.row_item_name);
        name.setText(item.getName());
        TextView price = (TextView) convertView.findViewById(R.id.row_item_price);
        price.setText("￥"+item.getPrice());
        return convertView;
    }
}
