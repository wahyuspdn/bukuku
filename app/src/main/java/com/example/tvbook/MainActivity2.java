package com.example.tvbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void pemmo(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void sister(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }

    public void pemweb(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
        startActivity(intent);
    }

    public void imk(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
        startActivity(intent);
    }

    public void pai(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
        startActivity(intent);
    }

    public void aks(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
        startActivity(intent);
    }

    public void be(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity9.class);
        startActivity(intent);
    }

    public void pengcit(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity10.class);
        startActivity(intent);
    }
}
