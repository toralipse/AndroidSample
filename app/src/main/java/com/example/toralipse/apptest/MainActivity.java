package com.example.toralipse.apptest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PREFERENCE_NAME = "AndroidTest";
    public static final String PREFERENCE_KEY = "TestText";

    private TextView label;
    private Button button;
    private EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = (TextView) findViewById(R.id.label);
        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getEditableText().toString();
                if((str != null)&&(str != "")){
                    save(str);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        label.setText(load());
    }

    void save(String text){
        SharedPreferences sp = getSharedPreferences(PREFERENCE_NAME,MODE_PRIVATE);
        sp.edit()
                .putString(PREFERENCE_KEY,text)
                .commit();
    }

    String load(){
        SharedPreferences sp = getSharedPreferences(PREFERENCE_NAME,MODE_PRIVATE);
        return sp.getString(PREFERENCE_KEY,"NoValue");
    }
}
