package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.widget.ListView;
import com.tencent.kinda.gen.KListView;
import com.tencent.kinda.gen.KListViewCallback;
import com.tencent.kinda.gen.KListViewOnScrollCallback;
import com.tencent.kinda.gen.KView;

public class MMKListView extends MMKView<ListView> implements KListView {
    private MMListViewAdapter adapter;
    private KListViewCallback mListViewCallback;

    private void binding() {
        this.adapter = new MMListViewAdapter(this.mContext, this.mListViewCallback);
        ((ListView) getView()).setAdapter(this.adapter);
    }

    public void addFooter(KView kView) {
    }

    public void addHeader(KView kView) {
    }

    public boolean getShowScrollBar() {
        return false;
    }

    public boolean getVertical() {
        return false;
    }

    public void setImpl(KListViewCallback kListViewCallback) {
        this.mListViewCallback = kListViewCallback;
        binding();
    }

    public void setOnScrollCallback(KListViewOnScrollCallback kListViewOnScrollCallback) {
    }

    public void setShowScrollBar(boolean z) {
    }

    public void setVertical(boolean z) {
    }

    public ListView createView(Context context) {
        return new ListView(context);
    }
}
