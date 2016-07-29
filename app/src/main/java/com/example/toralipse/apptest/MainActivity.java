package com.example.toralipse.apptest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List data = Arrays.asList(
            new Item("google","http://google.com"),
            new Item("yahoo","http://yahoo.co.jp"),
            new Item("amazon","http://amazon.co.jp"),
            new Item("google","http://google.com"),
            new Item("yahoo","http://yahoo.co.jp"),
            new Item("amazon","http://amazon.co.jp"),
            new Item("google","http://google.com"),
            new Item("yahoo","http://yahoo.co.jp"),
            new Item("amazon","http://amazon.co.jp"),
            new Item("google","http://google.com"),
            new Item("yahoo","http://yahoo.co.jp"),
            new Item("amazon","http://amazon.co.jp")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView)findViewById(R.id.list);
        MyAdapter adapter = new MyAdapter(this,data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = (Item)parent.getItemAtPosition(position);
                Intent next = new Intent(Intent.ACTION_VIEW, Uri.parse(item.url));
                startActivity(next);
            }
        });
    }
}
