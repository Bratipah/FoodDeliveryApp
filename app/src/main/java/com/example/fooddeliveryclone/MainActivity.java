package com.example.fooddeliveryclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fooddeliveryclone.adapter.AsiaFoodAdapter;
import com.example.fooddeliveryclone.adapter.PopularFoodAdapter;
import com.example.fooddeliveryclone.model.AsiaFood;
import com.example.fooddeliveryclone.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dummy model data for popular food
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood( "Float Cake Vietnam","7.05",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood( "Chicken Drumstick","17.05",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka","25.70",R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);


        // dummy model data for asia food
        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood( "Chicago Pizza","20.00",R.drawable.asiafood1,"4.5", "Braiand Restaurant"));
        asiaFoodList.add(new AsiaFood( "Strawberry cake","25.00",R.drawable.asiafood2,"4.2", "Friends Restaurant"));

        setAsiaRecycler(asiaFoodList);
    }
    public void  setPopularRecycler(List<PopularFood> popularFoodList){
        //setting recycler for popularFood.
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
       popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    public void  setAsiaRecycler(List<AsiaFood> asiaFoodList){
        //setting recycler for AsiaFood.
        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }
}