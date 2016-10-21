package com.example.toralipse.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    private Button add;
    private EditText name,price;
    private ListView list;

    private ItemAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        RealmConfiguration realmConfig =
                new RealmConfiguration.Builder()
                        .name("sample")
                        .schemaVersion(1)
                        .deleteRealmIfMigrationNeeded()
                        .build();
        Realm.setDefaultConfiguration(realmConfig);
        final Realm realm = Realm.getDefaultInstance();

        list =(ListView)findViewById(R.id.list);
        name = (EditText)findViewById(R.id.name);
        price = (EditText)findViewById(R.id.price);
        add = (Button)findViewById(R.id.add_btn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_name = name.getEditableText().toString();
                if(input_name == ""  || input_name == null) return;
                int input_price;
                try{
                    input_price= Integer.valueOf(price.getEditableText().toString());
                }catch (Exception e){
                    return;
                }
                realm.beginTransaction();
                Item item = realm.createObject(Item.class);
                item.setName(input_name);
                item.setPrice(input_price);
                realm.commitTransaction();

                name.setText("");
                price.setText("");

                adapter.add(item);
                adapter.notifyDataSetChanged();
            }
        });

        List tmp = new LinkedList();
        tmp.addAll(realm.where(Item.class).findAll());
        adapter = new ItemAdapter(this,tmp);
        list.setAdapter(adapter);
    }
}
