package com.example.mobilereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button developer_info_btn = (Button) findViewById(R.id.userbutton2);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(intent);
            }
        });
        btnSh = (Button) findViewById(R.id.button);

        // 버튼 클릭 이벤트 정의
        btnSh.setOnClickListener(this);
    }

    // 버튼 이벤트 정의
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast toast = Toast.makeText(getApplicationContext(), "사용가능한 아이디입니다.", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 200, 200);
                toast.show();
                break;
        }
    }
}