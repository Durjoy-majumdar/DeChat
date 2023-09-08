package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C59264a;
import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.a */
public interface C3342a<T extends C9493c> extends C59264a<C3343b<T>> {
    boolean checkAndShowBusinessPermissionDialog();

    int getCommentScene();

    void onLoadMore();

    void onRefresh();

    void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar);
}
