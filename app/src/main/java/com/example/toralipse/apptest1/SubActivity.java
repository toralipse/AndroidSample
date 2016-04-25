package com.example.toralipse.apptest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    private TextView label;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        label = (TextView)findViewById(R.id.label_sub);
        label.setText("SubActivity onCreate");
        Toast.makeText(this, "SubActivity onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        label.setText("SubActivity onStart");
        Toast.makeText(this, "SubActivity onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        label.setText("SubActivity onResume");
        Toast.makeText(this, "SubActivity onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        label.setText("SubActivity onPause");
        Toast.makeText(this, "SubActivity onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        label.setText("SubActivity onStop");
        Toast.makeText(this, "SubActivity onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        label.setText("SubActivity onDestroy");
        Toast.makeText(this, "SubActivity onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        label.setText("SubActivity onRestart");
        Toast.makeText(this, "SubActivity onRestart",Toast.LENGTH_SHORT).show();
    }
}
