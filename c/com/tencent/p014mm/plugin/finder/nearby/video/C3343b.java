package com.tencent.p014mm.plugin.finder.nearby.video;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C8178c;
import java.util.ArrayList;
import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.b */
public interface C3343b<T extends C9493c> extends C8178c<C3342a<T>> {
    /* renamed from: c */
    RefreshLoadMoreLayout mo3668c();

    /* renamed from: d */
    void mo3669d(ArrayList<T> arrayList);

    RecyclerView getRecyclerView();
}
