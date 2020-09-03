package com.example.ex014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    Double total;
    TextView showing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        showing= (TextView) findViewById(R.id.showing);

        show();
    }

    public void show(){
        Intent get1= getIntent();
        total=get1.getDoubleExtra("total",0.0);
        showing.setText("Credits:   "+total);
    }
    public void back(View view) {
        finish();
    }
}