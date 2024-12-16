package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity extends AppCompatActivity {
    Button  b1,b2;
    EditText et1,et2;
    int num1,num2,quot;
    String getNum1,getNum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        b1=(Button) findViewById(R.id.back3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(s);
            }
        });
        b2=(Button) findViewById(R.id.divis);
        et1=(EditText) findViewById(R.id.numeee1);
        et2=(EditText) findViewById(R.id.numeee2);
        b2=(Button) findViewById(R.id.divis);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                quot=num1/num2;
                result=String.valueOf(quot);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
            }

        });
    }
}