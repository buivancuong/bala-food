package com.example.balafood.ui.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.balafood.R;
import com.example.balafood.ui.start.StartMenuActivity;

public class MarketActivity extends AppCompatActivity {

    Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        btn_done = findViewById(R.id.btn_market_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarketActivity.this, StartMenuActivity.class);
                startActivity(intent);
            }
        });

    }
}
