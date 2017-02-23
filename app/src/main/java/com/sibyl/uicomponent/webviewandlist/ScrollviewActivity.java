package com.sibyl.uicomponent.webviewandlist;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.sibyl.uicomponent.webviewandlist.adapter.ScrollviewAdapter;

public class ScrollviewActivity extends AppCompatActivity {

    private NestedScrollView scrollView;
    private WebView webView;
    private RecyclerView recyclerView;
    private ScrollviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        initView();
    }

    private void initView() {
        scrollView = (NestedScrollView) findViewById(R.id.scrollView);
        webView = (WebView) findViewById(R.id.webview);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setSmoothScrollbarEnabled(true);
        layoutManager.setAutoMeasureEnabled(true);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new ScrollviewAdapter();
        recyclerView.setAdapter(adapter);

        String url="https://mp.weixin.qq.com/s?__biz=MjM5MDczMjM2MA==&mid=2652388593&idx=1&sn=7c08949e42d61de2f022ffcee552738a&chksm=bdacc5d68adb4cc0a038f92efca95acf17ef1facbc86553441e8f47dbb0316104b80b6379485&scene=0&key=bda634fb2c7300a3b6c583ff2fe7827c6ddb195c74ff4c744b765cd8a48e9f4e67360531050b8b7addce3f97d0b9440e5a0b6bc1948c635320267447fc4b8075deffdf61ea7ecc241bf9a9f120f378cd&ascene=0&uin=OTYwOTY3Njgw&devicetype=iMac+MacBookPro11%2C4+OSX+OSX+10.11.6+build(15G31)&version=12010210&nettype=WIFI&fontScale=100&pass_ticket=kCRObwEpa%2BTF24xhAVuiq%2FBQ2Ki1t8IcSMer1q5hQg2vFO41c4RQRrTB236TDGFU";
        //                String url = "http://www.baidu.com";
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        webView.loadUrl(url);
    }
}
