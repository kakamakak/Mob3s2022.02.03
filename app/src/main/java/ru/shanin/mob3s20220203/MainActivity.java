package ru.shanin.mob3s20220203;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private final String[] myMonths = {
            "Январь", "Февраль", "Март",
            "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь",
            "Октябрь", "Ноябрь", "Декабрь",
            "Январь", "Февраль", "Март",
            "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь",
            "Октябрь", "Ноябрь", "Декабрь"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                myMonths
        );
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String resultOnClick = myMonths[position] + " " + position + " " + id;
        Log.w("ListActivity", resultOnClick);
        Intent intent = SecondActivity.startSecondActivity(this, resultOnClick);
        startActivity(intent);
    }
}