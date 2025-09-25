package com.example.recyclerview_tutorial;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<>();

        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img1));
        items.add(new Item("Tom Cruise", "MrWick@email.com", R.drawable.img3));
        items.add(new Item("The Rock", "MrWick@email.com", R.drawable.img2));
        items.add(new Item("Shammah Banda", "MrWick@email.com", R.drawable.img5));
        items.add(new Item("Chawa Nkonde", "MrWick@email.com", R.drawable.img4));
        items.add(new Item("Given Derrick", "MrWick@email.com", R.drawable.img6));
        items.add(new Item("Christopher Nyirongo", "MrWick@email.com", R.drawable.img7));
        items.add(new Item("Blacks ", "MrWick@email.com", R.drawable.img8));
        items.add(new Item("James Bondi", "MrWick@email.com", R.drawable.img3));
        items.add(new Item("Trevor Noah", "MrWick@email.com", R.drawable.img5));
        items.add(new Item("Pick war", "MrWick@email.com", R.drawable.img4));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img7));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img8));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img6));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img2));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img3));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img7));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img8));
        items.add(new Item("John Wick", "MrWick@email.com", R.drawable.img1));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}