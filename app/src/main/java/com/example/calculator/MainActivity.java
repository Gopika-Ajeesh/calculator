package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.addc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj1=new Intent(getApplicationContext(), addactivity.class);
                startActivity(obj1);

            }
        });
        b2=(Button) findViewById(R.id.subb);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj2=new Intent(getApplicationContext(), subactivity.class);
                startActivity(obj2);
            }
        });
        b3=(Button) findViewById(R.id.multi);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj3=new Intent(getApplicationContext(), Multiactivity.class);
                startActivity(obj3);
            }
        });
        b4=(Button) findViewById(R.id.divi);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj4=new Intent(getApplicationContext(), DivActivity.class);
                startActivity(obj4);
            }
        });
    }
}