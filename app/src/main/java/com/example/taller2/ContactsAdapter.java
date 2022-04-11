package com.example.taller2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class ContactsAdapter extends CursorAdapter {

    private static final int CONTACT_ID_INDEX = 0;
    private static final int DISPLAY_NAME_INDEX = 1;

    public ContactsAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.contacts, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView idContact = (TextView) view.findViewById(R.id.idContact);
        TextView contact = (TextView) view.findViewById(R.id.nContact);
        int id = cursor.getInt(CONTACT_ID_INDEX);
        String name = cursor.getString(DISPLAY_NAME_INDEX);
        idContact.setText(String.valueOf(id));
        contact.setText(name);
    }
}
