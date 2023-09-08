package com.tencent.p014mm.p136ui.widget.sortlist;

import android.database.DataSetObserver;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;

/* renamed from: com.tencent.mm.ui.widget.sortlist.a */
public class C106835a extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ DragSortListView.C106827c f319822a;

    public C106835a(DragSortListView.C106827c cVar, DragSortListView dragSortListView) {
        this.f319822a = cVar;
    }

    public void onChanged() {
        this.f319822a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.f319822a.notifyDataSetInvalidated();
    }
}
