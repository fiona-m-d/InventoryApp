package com.example.android.inventoryapp.Data;

import android.provider.BaseColumns;

/**
 * Created by fiona on 29/07/2018.
 */

public final class InventoryContract {

    private InventoryContract () {}

    public static final class InventoryEntry implements BaseColumns {

        public final static String TABLE_NAME = "Inventory";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME = "name";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_PRODUCT_SUPPLIER = "supplier name";
        public final static String COLUMN_SUPPLIER_PHONENUMBER = "supplier phone number";

    }
}