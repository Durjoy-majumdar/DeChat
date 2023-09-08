package com.tencent.p014mm.plugin.finder.search.eventsearch;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import jq3.C9500j;
import kp1.C10382g;

/* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchViewConfig */
public final class FinderActivitySearchViewConfig implements C10382g {
    /* renamed from: U */
    public C9500j mo3948U() {
        return new FinderActivitySearchViewConfig$buildItemCoverts$1();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ RecyclerView.C0129l mo3949a() {
        return null;
    }

    /* renamed from: b */
    public RecyclerView.LayoutManager mo3950b(Context context) {
        C87412m.m108594g(context, "context");
        return new FinderLinearLayoutManager(context);
    }
}
