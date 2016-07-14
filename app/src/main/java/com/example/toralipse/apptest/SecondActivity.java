package com.example.toralipse.apptest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by toralipse on 2016/07/14.
 */
public class SecondActivity extends AppCompatActivity {
    private EditText url_text;
    private Button go_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        url_text = (EditText)findViewById(R.id.url_text);
        go_button = (Button)findViewById(R.id.go_button);
        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Intent.ACTION_VIEW, Uri.parse(url_text.getEditableText().toString()));
                startActivity(next);
                /* // エラーチェック込み
                try{
                    Uri url = Uri.parse(url_text.getEditableText().toString());
                    if((url.getScheme().equals("http"))||(url.getScheme().equals("https"))) {
                        Intent next = new Intent(Intent.ACTION_VIEW, url);
                        startActivity(next);
                    }
                }catch (Exception e){

                }
                */
            }
        });
    }
}
