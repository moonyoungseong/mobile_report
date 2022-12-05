package com.example.mobilereport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton developer_info_btn = (ImageButton) findViewById(R.id.imageButton);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), search_result.class);
                startActivity(intent);
            }
        });

        ImageButton developer_info_btn2 = (ImageButton) findViewById(R.id.imageButton2);
        developer_info_btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), shopActivity.class);
                startActivity(intent);
            }
        });

        Button developer_info_btn3 = (Button) findViewById(R.id.button9);
        developer_info_btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), bestbookActivity.class);
                startActivity(intent);
            }
        });

        Button developer_info_btn4 = (Button) findViewById(R.id.button10);
        developer_info_btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(intent);
            }
        });
    }
}
