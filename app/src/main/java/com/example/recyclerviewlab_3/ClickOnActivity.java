package com.example.recyclerviewlab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class ClickOnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_on);

        Cactusic cactusic = (Cactusic) getIntent().getSerializableExtra("car");

        TextView title = findViewById(R.id.title);
        TextView family = findViewById(R.id.listdatacharact_1);
        ImageView image = findViewById(R.id.image);

        title.setText(cactusic.getCactusName());
        family.setText(cactusic.getFamilyCactus());
        image.setImageResource(cactusic.getImage());
    }

}
