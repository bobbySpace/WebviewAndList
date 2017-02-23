package com.sibyl.uicomponent.webviewandlist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.sibyl.uicomponent.webviewandlist.R;

/**
 * Created by bobby on 17/2/22.
 */

public class HeaderAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static final int VIEW_TYPE_WEBVIEW =1;
    public static final int VIEW_TYPE_IMAGE_TEXT = 2;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder holder = null;
        switch (viewType) {
            case VIEW_TYPE_IMAGE_TEXT:

                holder = new BaseViewHolder(LayoutInflater.from(
                        parent.getContext()).inflate(R.layout.item_text_image, parent,
                        false));
                break;
            case VIEW_TYPE_WEBVIEW:
                ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                WebView web = new WebView(parent.getContext());
                web.setLayoutParams(lp);
                String url="https://mp.weixin.qq.com/s?__biz=MjM5MDczMjM2MA==&mid=2652388593&idx=1&sn=7c08949e42d61de2f022ffcee552738a&chksm=bdacc5d68adb4cc0a038f92efca95acf17ef1facbc86553441e8f47dbb0316104b80b6379485&scene=0&key=bda634fb2c7300a3b6c583ff2fe7827c6ddb195c74ff4c744b765cd8a48e9f4e67360531050b8b7addce3f97d0b9440e5a0b6bc1948c635320267447fc4b8075deffdf61ea7ecc241bf9a9f120f378cd&ascene=0&uin=OTYwOTY3Njgw&devicetype=iMac+MacBookPro11%2C4+OSX+OSX+10.11.6+build(15G31)&version=12010210&nettype=WIFI&fontScale=100&pass_ticket=kCRObwEpa%2BTF24xhAVuiq%2FBQ2Ki1t8IcSMer1q5hQg2vFO41c4RQRrTB236TDGFU";
//                String url = "http://www.baidu.com";
                WebSettings settings = web.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);

                web.loadUrl(url);
                holder = new BaseViewHolder(web);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return VIEW_TYPE_WEBVIEW;
        }else{
            return VIEW_TYPE_IMAGE_TEXT;
        }
    }

    @Override
    public int getItemCount() {
        return 500;
    }
}
