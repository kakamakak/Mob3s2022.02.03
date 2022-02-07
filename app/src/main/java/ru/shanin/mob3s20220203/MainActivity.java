package ru.shanin.mob3s20220203;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

public class MainActivity extends ListActivity {

    private Contact[] myContact;
    private static int autoIncrementId = 0;

    private void intiData() {
        myContact = new Contact[10];
        for (int i = 0; i < myContact.length; i++) {
            myContact[i] = NewData.newContact();
            if (myContact[i].get_id() == Contact.UNDEFINED_ID)
                myContact[i].set_id(++autoIncrementId);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intiData();
        ArrayAdapter<Contact> myAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                myContact
        );
        setListAdapter(myAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Gson gson = new Gson();
        String resultOnClick = gson.toJson(myContact[position]);
        Log.w("ListActivity", resultOnClick);
        Intent intent = SecondActivity.startSecondActivity(this, resultOnClick);
        startActivity(intent);
    }
}