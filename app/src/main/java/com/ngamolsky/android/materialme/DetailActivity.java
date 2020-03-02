package com.ngamolsky.android.materialme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.materialme.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize ImageView and TextView title
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        TextView sportsTitle = findViewById(R.id.titleDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));

        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);
    }
}
