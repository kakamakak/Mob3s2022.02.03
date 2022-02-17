package ru.shanin.mob3s20220203.presentation.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import ru.shanin.mob3s20220203.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
        initViewModel();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);

    }

    private void initViewModel() {
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.dataLiveData.observe(this, data -> );
    }


}