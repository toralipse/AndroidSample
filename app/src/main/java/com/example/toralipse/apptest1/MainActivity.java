package com.example.toralipse.apptest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView label;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = (TextView)findViewById(R.id.label);
        label.setText("MainActivity onCreate");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);
            }
        });
        Toast.makeText(this, "MainActivity onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        label.setText("MainActivity onStart");
        Toast.makeText(this, "MainActivity onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        label.setText("MainActivity onResume");
        Toast.makeText(this, "MainActivity onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        label.setText("MainActivity onPause");
        Toast.makeText(this, "MainActivity onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        label.setText("MainActivity onStop");
        Toast.makeText(this, "MainActivity onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        label.setText("MainActivity onDestroy");
        Toast.makeText(this, "MainActivity onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        label.setText("MainActivity onRestart");
        Toast.makeText(this, "MainActivity onRestart",Toast.LENGTH_SHORT).show();
    }
}
