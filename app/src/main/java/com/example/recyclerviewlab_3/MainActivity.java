package com.example.recyclerviewlab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Cactusic> cactusic = new ArrayList<>();
        cactusic.add(new Cactusic("astrophytum", "Domain: Eukaryotes\n" ,R.drawable.astrophytum));
        cactusic.add(new Cactusic("Mammilliaria","Domain: Eukaryotes\n" ,R.drawable.mammilliaria));
        cactusic.add(new Cactusic("Mammilliaria\n" +"Pink","Domain: Eukaryotes\n",R.drawable.mammilliariapink));
        cactusic.add(new Cactusic("Discocactus","Domain: Eukaryotes\n",R.drawable.discocactus));
        cactusic.add(new Cactusic("Prickly Pear","Domain: Eukaryotes\n",R.drawable.pricklypear));
        cactusic.add(new Cactusic("Shallow whaired","Domain: Eukaryotes\n",R.drawable.shallowhairedpricklypear));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(cactusic);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
