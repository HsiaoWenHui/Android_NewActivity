package com.example.hsiaowenhui.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        tv=(TextView)this.findViewById(R.id.tv_display);
        Intent intentThatStartedThisActivity=getIntent();
        if(intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            String textEntered=intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            tv.setText(textEntered);
        }
    }
}
