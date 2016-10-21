package com.example.toralipse.apptest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

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
                // action
                final String url = editText.getEditableText().toString();
                if(url == null || url.equals("") ) return;
                final Handler handler = new Handler();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{

                            OkHttpClient client = new OkHttpClient();
                            Request request = new Request.Builder()
                                .url(url)
                                .build();
                            Response response = client.newCall(request).execute();
                            final String message = response.body().string();
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    label.setText(message);
                                }
                            });

                        }catch (Exception e) {

                            e.printStackTrace();
                            final String message = "Error";
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    label.setText(message);
                                }
                            });

                        }

                    }
                }).start();
            }
        });
    }
}
