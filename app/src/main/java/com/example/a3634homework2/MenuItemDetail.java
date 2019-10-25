package com.example.a3634homework2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MenuItemDetail extends AppCompatActivity {
    private TextView menuItemTextView;
    private TextView menuItemDescriptionTextView;
    private TextView menuItemPriceTextView;
    private ImageView itemImageView;

    public Double itemTotalPrice;
    ElegantNumberButton orderAmountButton;
    TextView itemCounter;
    Button addToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_detail);

        //add to order button methods
        addToOrder = findViewById(R.id.add_to_order_button);

        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int menuItemID = intent.getIntExtra("MenuItemID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        MenuItem menuItem = MenuData.getMenuItemByID(menuItemID);

        //finding menu item, description price, image for each item
        menuItemTextView = findViewById(R.id.detailItem);
        menuItemDescriptionTextView = findViewById(R.id.detailDescription);
        menuItemPriceTextView = findViewById(R.id.detailPrice);

        itemImageView = findViewById(R.id.detailPic);

        //setting menu item, description price, image for each item
        menuItemTextView.setText(menuItem.getItem());
        menuItemDescriptionTextView.setText(menuItem.getItemDescription());
        menuItemPriceTextView.setText(menuItem.getItemPrice());

        itemImageView.setImageResource(menuItem.getPicDrawableID());


        //Using the elegant button to get the number of items
        orderAmountButton= findViewById(R.id.orderamount);
        itemCounter=findViewById(R.id.itemcounter);

        orderAmountButton.setOnValueChangeListener(new ElegantNumberButton.OnValueChangeListener() {
            @Override
            public void onValueChange(ElegantNumberButton view, int previousValue, int newValue) {

                String itemCount = orderAmountButton.getNumber();
                int intItemCount = Integer.parseInt(itemCount);
                String stringFinalPrice=String.valueOf(intItemCount);
                itemCounter.setText("You have selected " + stringFinalPrice + " item(s)");

            }
        });
    }


}



