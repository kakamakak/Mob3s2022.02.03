package ru.shanin.mob3s20220203._old;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import ru.shanin.mob3s20220203.R;
import ru.shanin.mob3s20220203.domain.entity.Contact;

public class SecondActivity extends AppCompatActivity {

    private static final String TEXT_INPUT = "input text";
    private String inputText;
    private Contact myContact;

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
        myContact = (new Gson()).fromJson(inputText, Contact.class);
        Log.w("parseIntent", myContact.toMyString());

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
        textView.setText( myContact.toMyString());
    }
}