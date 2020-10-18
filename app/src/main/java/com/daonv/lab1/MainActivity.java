package com.daonv.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edName = findViewById(R.id.edtName);

    }

    public void btnLogin(View view) {
        Log.e("LOG","CLick");

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    protected  void onStart() {
        super.onStart();
        Log.e("LOG", "Click");
    }
    protected  void onDestroy() {
        super.onDestroy();
        Log.e("LOG", "Click");
    }
}