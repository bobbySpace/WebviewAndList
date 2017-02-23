package com.sibyl.uicomponent.webviewandlist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sibyl.uicomponent.webviewandlist.R;
import com.sibyl.uicomponent.webviewandlist.adapter.BaseViewHolder;

/**
 * Created by bobby on 17/2/22.
 */

public class ScrollviewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder holder = null;
        holder = new BaseViewHolder(LayoutInflater.from(
                parent.getContext()).inflate(R.layout.item_text_image, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return 500;
    }
}
