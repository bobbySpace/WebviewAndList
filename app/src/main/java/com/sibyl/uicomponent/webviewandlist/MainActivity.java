package com.sibyl.uicomponent.webviewandlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button headerButton;
    private Button scrollviewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerButton = (Button) findViewById(R.id.header);
        scrollviewButton = (Button) findViewById(R.id.scrollView);
        headerButton.setOnClickListener(this);
        scrollviewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.header:
                Intent headerIntent = new Intent();
                headerIntent.setClass(this, HeaderActivity.class);
                startActivity(headerIntent);
                break;
            case R.id.scrollView:
                Intent scrollIntent = new Intent();
                scrollIntent.setClass(this, ScrollviewActivity.class);
                startActivity(scrollIntent);
                break;
            default:
                break;
        }
    }
}
