package com.example.tvbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class MainActivity9 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void home7(View view) {
        Intent intent = new Intent(MainActivity9.this, MainActivity2.class);
        startActivity(intent);
    }

}
