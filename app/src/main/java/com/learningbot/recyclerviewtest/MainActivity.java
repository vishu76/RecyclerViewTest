package com.learningbot.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.learningbot.recyclerviewtest.Adapter.MyAdapter;
import com.learningbot.recyclerviewtest.Model.ItemModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

      ItemModel[] mydata=new ItemModel[]{
            new ItemModel("Burger",R.drawable.eggburger),
            new ItemModel("full Meal",R.drawable.full_meal),
            new ItemModel("Noodles",R.drawable.noodles),
            new ItemModel("Pasta",R.drawable.pasta),
              new ItemModel("Burger",R.drawable.eggburger),
              new ItemModel("full Meal",R.drawable.full_meal),
              new ItemModel("Noodles",R.drawable.noodles),
              new ItemModel("Pasta",R.drawable.pasta),
              new ItemModel("Burger",R.drawable.eggburger),
              new ItemModel("full Meal",R.drawable.full_meal),
              new ItemModel("Noodles",R.drawable.noodles),
              new ItemModel("Pasta",R.drawable.pasta)
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);

        MyAdapter adapter=new MyAdapter(mydata);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}