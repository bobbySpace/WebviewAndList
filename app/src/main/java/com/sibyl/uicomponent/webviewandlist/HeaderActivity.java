package com.sibyl.uicomponent.webviewandlist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sibyl.uicomponent.webviewandlist.adapter.HeaderAdapter;

public class HeaderActivity extends Activity {
    public static String TAG = "HeaderActivity";

    private RecyclerView mRvHome;
    private HeaderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header);
        initView();
    }

    private void initView() {
        //init recyclerview
        mRvHome = (RecyclerView) findViewById(R.id.listview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRvHome.setLayoutManager(linearLayoutManager);

        mAdapter = new HeaderAdapter();
        mRvHome.setAdapter(mAdapter);

    }
}
