package com.example.android.inventoryapp;

/**
 * Created by fiona on 05/08/2018.
 */


import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.android.inventoryapp.Data.InventoryContract.InventoryEntry;

public class InventoryCursorAdapter extends CursorAdapter {

    // Construct a new InventoryCursorAdapter
    public InventoryCursorAdapter(Context context, Cursor c) {
        super(context, c, 0 /* flags */);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // Inflate a list item view using the layout specified in list_item.xml
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find individual views that we want to modify in the list item layout
        TextView nameTextView = (TextView) view.findViewById(R.id.name);
        TextView priceTextView = (TextView) view.findViewById(R.id.price);
        TextView quantityTextView = (TextView) view.findViewById(R.id.quantity);
        TextView supplierTextView = (TextView) view.findViewById(R.id.supplier);
        TextView phoneTextView = (TextView) view.findViewById(R.id.phone_number);

        // Find the columns of each of the attributes
        int nameColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_NAME);
        int priceColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_PRICE);
        int quantityColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_QUANTITY);
        int supplierColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_PRODUCT_SUPPLIER);
        int phoneColumnIndex = cursor.getColumnIndex(InventoryEntry.COLUMN_SUPPLIER_PHONENUMBER);

        // Read the attributes from the Cursor for the current item
        String productName = cursor.getString(nameColumnIndex);
        double productPrice = cursor.getDouble(priceColumnIndex);
        int productQuantity = cursor.getInt(quantityColumnIndex);
        String productSupplier = cursor.getString(supplierColumnIndex);
        String supplierPhone = cursor.getString(phoneColumnIndex);

        // Update the TextViews with the attributes for the current item
        nameTextView.setText(productName);
        priceTextView.setText(Double.toString(productPrice));
        quantityTextView.setText(Integer.toString(productQuantity));
        supplierTextView.setText(productSupplier);
        phoneTextView.setText(supplierPhone);
    }
}

