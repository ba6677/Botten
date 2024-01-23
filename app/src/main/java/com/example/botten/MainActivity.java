package com.example.botten;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

    }

    public void Clickeme(View view){
        tv = findViewById(R.id.tv);
        tv.setTextSize(10);
        tv.setTextColor(Color.RED);
        btn.setText("oh yeah ive been clicked");
    }


}