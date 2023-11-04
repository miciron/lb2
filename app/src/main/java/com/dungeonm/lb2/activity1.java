package com.dungeonm.lb2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        //Возврат на основное активити
        Button button = findViewById(R.id.button8);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(activity1.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}