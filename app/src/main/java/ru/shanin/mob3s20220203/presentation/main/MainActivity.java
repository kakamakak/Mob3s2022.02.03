package ru.shanin.mob3s20220203.presentation.main;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import ru.shanin.mob3s20220203.R;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
        initViewModel();
    }

    private void initView() {
        tv = findViewById(R.id.textView);

    }

    private void initViewModel() {
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.dataLiveData.observe(this, data -> tv.setText(data.toString()));
    }


}