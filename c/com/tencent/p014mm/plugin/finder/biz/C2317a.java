package com.tencent.p014mm.plugin.finder.biz;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.biz.a */
public final class C2317a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f12548d;

    /* renamed from: e */
    public final /* synthetic */ int f12549e;

    /* renamed from: f */
    public final /* synthetic */ int f12550f;

    public C2317a(RecyclerView recyclerView, int i, int i2) {
        this.f12548d = recyclerView;
        this.f12549e = i;
        this.f12550f = i2;
    }

    public final void run() {
        RecyclerView.LayoutManager layoutManager = this.f12548d.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i = this.f12549e;
        int i2 = this.f12550f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(gridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        gridLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(gridLayoutManager, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
