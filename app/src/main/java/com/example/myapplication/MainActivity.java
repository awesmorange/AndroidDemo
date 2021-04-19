package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.thorineaccount.activity.LoginActivity;

public class MainActivity extends AppCompatActivity {
    Button btn2Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2Login=(Button) this.findViewById(R.id.button2Login);
        btn2Login.setOnClickListener(new View.OnClickListener() {//实现登录功能
            @Override
            public void onClick(View view) {
                toLogin();
            }
        });
    }

    private void toLogin()//跳转到注册页面
    {
        Log.v("MainActivity", "login");
        Intent intent=new Intent();
        intent.setClass(this, LoginActivity.class);
        startActivity(intent);
    }
}