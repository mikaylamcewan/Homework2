package com.example.a3634homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public Button viewOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //view order button code
        viewOrderButton =findViewById(R.id.view_order_button);

        viewOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyOrder();
            }
        });

        recyclerView = findViewById(R.id.main_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MenuItemAdapter menuItemAdapter = new MenuItemAdapter();

        menuItemAdapter.setData(MenuData.getAllMenuItems());
        recyclerView.setAdapter(menuItemAdapter);
    }

    //opening my order page from the menuItem activity
    public void openMyOrder() {
        Intent intent = new Intent(this, MyOrder.class);
        startActivity(intent);
    }



}
