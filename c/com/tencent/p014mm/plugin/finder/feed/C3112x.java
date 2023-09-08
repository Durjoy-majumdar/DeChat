package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.LinearLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.feed.x */
public final class C3112x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinearLayoutManager f14974d;

    /* renamed from: e */
    public final /* synthetic */ int f14975e;

    /* renamed from: f */
    public final /* synthetic */ int f14976f;

    public C3112x(LinearLayoutManager linearLayoutManager, int i, int i2) {
        this.f14974d = linearLayoutManager;
        this.f14975e = i;
        this.f14976f = i2;
    }

    public final void run() {
        LinearLayoutManager linearLayoutManager = this.f14974d;
        int i = this.f14975e;
        int i2 = this.f14976f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
