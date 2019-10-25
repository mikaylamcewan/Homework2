package com.example.a3634homework2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.HashMap;


public class MyOrder extends AppCompatActivity {

    TextView totalCostAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_order_layout);

//      //TO COMPLETE- finish the HashMap to get the list of things that have been selected

        totalCostAmount = findViewById(R.id.totalcostamount);
        totalCostAmount.setText(String.format("$%.2f", MenuData.totalPrice));
//
//
//        HashMap<MenuItem, Integer> orderedItems = MenuData.orderedItems;
////
//        MyOrderAdapter menuItemAdapter = new MyOrderAdapter(orderedItems);
////
//        RecyclerView view = findViewById(R.id.rv_ordered_items);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        view.setLayoutManager(layoutManager);
//
//        view.setAdapter(menuItemAdapter);
    }
}
