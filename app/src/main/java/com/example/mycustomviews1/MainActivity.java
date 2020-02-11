package com.example.mycustomviews1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CustomView customView = new CustomView(this);
        mCustomView = findViewById(R.id.customView);
        findViewById(R.id.btn_swap_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCustomView.swapColor();
            }
        });
    }
}
