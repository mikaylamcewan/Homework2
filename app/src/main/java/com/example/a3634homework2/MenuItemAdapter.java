package com.example.a3634homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemAdapter.MenuItemViewHolder> {

    private ArrayList<MenuItem> menuItemsToAdapt;

    public void setData(ArrayList<MenuItem> menuItemsToAdapt) {
        this.menuItemsToAdapt = menuItemsToAdapt;
    }


    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.menu_item, parent, false);

        //  For creating instance of my ViewHolder
        MenuItemViewHolder menuItemViewHolder = new MenuItemViewHolder(view);

        return menuItemViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {

        final MenuItem menuItemAtPosition = menuItemsToAdapt.get(position);

        holder.itemTextView.setText(menuItemAtPosition.getItem());
        holder.itemPriceTextView.setText(menuItemAtPosition.getItemPrice());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context con = view.getContext();

                Intent intent = new Intent(con, MenuItemDetail.class);
                intent.putExtra("MenuItemID", menuItemAtPosition.getMenuItemID());
                con.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(menuItemAtPosition.getPicDrawableID());

    }
    @Override
    public int getItemCount() {
        return menuItemsToAdapt.size();
    }

    public static class MenuItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView itemTextView;
        public TextView itemPriceTextView;
        public ImageView itemImageView;

        public MenuItemViewHolder(View v) {
            super(v);
            view = v;
            itemTextView = v.findViewById(R.id.itemName);
            itemPriceTextView = v.findViewById(R.id.itemPrice);
            itemImageView = v.findViewById(R.id.itemPicture);
        }
    }
}
