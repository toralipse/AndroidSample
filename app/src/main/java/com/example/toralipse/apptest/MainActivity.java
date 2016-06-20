package com.example.toralipse.apptest;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int NOTIFICATION_MINIMUM_ID = 0x1;

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
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());

                String str = editText.getEditableText().toString();

                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setContentTitle("1"+str);
                builder.setContentText("2"+str);
                builder.setSubText("3"+str);
                builder.setContentInfo("4"+str);
                builder.setWhen(System.currentTimeMillis());

                builder.setTicker("5"+str);

                NotificationManagerCompat manager = NotificationManagerCompat.from(getApplicationContext());
                manager.notify(NOTIFICATION_MINIMUM_ID, builder.build());
            }
        });
    }
}
