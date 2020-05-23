package com.example.balafood.ui.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.balafood.ui.suggest.FoodSuggestActivity;
import com.example.balafood.R;

public class StartMenuActivity extends AppCompatActivity {

    Button btnMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMarket = findViewById(R.id.btn_market);
        btnMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartMenuActivity.this, FoodSuggestActivity.class);
                startActivity(intent);
            }
        });

    }
}
