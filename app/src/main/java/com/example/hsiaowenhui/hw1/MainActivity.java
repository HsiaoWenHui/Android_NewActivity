package com.example.hsiaowenhui.hw1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDoSomethingCoolButton = (Button) findViewById(R.id.b_do_something_cool);
        mNameEntry = (EditText) findViewById(R.id.et_text_entry);
        mDoSomethingCoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textEntered = mNameEntry.getText().toString();
                Context context = MainActivity.this;
                Intent intent = new Intent(context, ChildActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT,textEntered);
                startActivity(intent);
            }
        });
    }
}
