package com.example.balafood.ui.suggest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.balafood.R;
import com.example.balafood.model.suggest.DayNutrition;
import com.example.balafood.model.suggest.Food;
import com.example.balafood.ui.market.MarketActivity;

import java.util.List;

public class FoodSuggestActivity extends AppCompatActivity {

    Button btnOkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_suggest);

        btnOkey = findViewById(R.id.btn_okey);
        btnOkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodSuggestActivity.this, MarketActivity.class);
                startActivity(intent);
            }
        });

    }

}
