package com.dungeonm.lb2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button button = findViewById(R.id.bt1);

        //оно переключает цвет
        button.setOnClickListener(new View.OnClickListener() {
            int x = 0;
            public void onClick(View view) {

                if (x == 0)
                {
                    button.setBackgroundColor(getResources().getColor(R.color.green2));
                    x = 1;
                }
                else if (x == 1)
                {
                    button.setBackgroundColor(getResources().getColor(R.color.green1));
                    x = 0;
                }
            }
       });

    }
}