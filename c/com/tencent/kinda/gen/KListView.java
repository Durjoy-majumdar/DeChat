package com.tencent.kinda.gen;

public interface KListView extends KView {
    void addFooter(KView kView);

    void addHeader(KView kView);

    boolean getShowScrollBar();

    boolean getVertical();

    void setImpl(KListViewCallback kListViewCallback);

    void setOnScrollCallback(KListViewOnScrollCallback kListViewOnScrollCallback);

    void setShowScrollBar(boolean z);

    void setVertical(boolean z);
}
