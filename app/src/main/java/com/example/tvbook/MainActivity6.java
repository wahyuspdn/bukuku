package com.example.tvbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class MainActivity6 extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void home4(View view) {
        Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
        startActivity(intent);
    }
}
