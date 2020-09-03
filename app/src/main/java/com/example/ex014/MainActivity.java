package com.example.ex014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText math;
    double sum,last,first;
    String number;
    int op;

    /**
     * op=1 -> add
     * op=2 -> minus
     * op=3 -> multiple
     * op=4 -> divide
     * meant for switch
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum=0.0;

        math=(EditText) findViewById(R.id.math);

    }


    public void add(View view) {
        number=math.getText().toString();
        if(number.equals("")){
            Toast.makeText(this, "you have to enter numbers", Toast.LENGTH_SHORT).show();
        }
        else {
                first = Double.parseDouble(number);
                math.setText("");
                op = 1;
        }
    }

    public void minus(View view) {
        number=math.getText().toString();
        if(number.equals("")){
            Toast.makeText(this, "you have to enter numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            first = Double.parseDouble(number);
            math.setText("");
            op = 2;
        }
    }

    public void multiple(View view) {
        number=math.getText().toString();
        if(number.equals("")){
            Toast.makeText(this, "you have to enter numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            first = Double.parseDouble(number);
            math.setText("");
            op = 3;
        }
    }

    public void divide(View view) {
        number=math.getText().toString();
        if(number.equals("")){
            Toast.makeText(this, "you have to enter numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            first = Double.parseDouble(number);
            math.setText("");
            op = 4;
        }
    }

    public void clear(View view) {
        sum= 0;
        math.setText("");
    }

    public void goToNewPage(View view) {
        Intent serv1= new Intent(this,Credits.class);
        serv1.putExtra("total",sum);
        startActivity(serv1);
    }

    public void equals(View view) {
        number=math.getText().toString();
        if(number.equals("")){
            Toast.makeText(this, "you have to enter numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            last = Double.parseDouble(number);
            switch (op) {
                case 1:
                    sum = first + last;
                    break;
                case 2:
                    sum = first - last;
                    break;
                case 3:
                    sum = first * last;
                    break;
                case 4:
                    sum = first / last;
                    break;
            }
            math.setText("" + sum);
            first = sum;
        }
    }
}