package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KTableView extends KView {
    void setCells(ArrayList<KTableViewCellManager> arrayList);

    void setEnableFooterRefreshView(boolean z);

    void setFooterRefreshViewLoadMoreCallbackImpl(VoidCallback voidCallback);

    void setOnBeginScrollCallbackImpl(VoidCallback voidCallback);
}
