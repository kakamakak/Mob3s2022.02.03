package ru.shanin.mob3s20220203;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TEXT_INPUT = "input text";
    private String inputText;

    private TextView textView;

    public static Intent startSecondActivity(Context context, String arg) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(TEXT_INPUT, arg);
        return intent;
    }

    private void initView() {
        textView = findViewById(R.id.textView);
    }

    private void parseIntent() {
        if (!getIntent().hasExtra(TEXT_INPUT))
            throw new RuntimeException("There is no input data");
        inputText = getIntent().getStringExtra(TEXT_INPUT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);
        initView();
        parseIntent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText(inputText);
    }
}