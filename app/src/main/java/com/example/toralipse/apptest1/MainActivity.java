package com.example.toralipse.apptest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView label;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = (TextView)findViewById(R.id.label);
        label.setText("onCreate");
        Toast.makeText(this, "onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        label.setText("onStart");
        Toast.makeText(this, "onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        label.setText("onResume");
        Toast.makeText(this, "onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        label.setText("onPause");
        Toast.makeText(this, "onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        label.setText("onStop");
        Toast.makeText(this, "onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        label.setText("onDestroy");
        Toast.makeText(this, "onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        label.setText("onRestart");
        Toast.makeText(this, "onRestart",Toast.LENGTH_SHORT).show();
    }
}
