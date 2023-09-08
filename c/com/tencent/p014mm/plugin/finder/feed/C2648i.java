package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.feed.i */
public final class C2648i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StaggeredGridLayoutManager f13500d;

    /* renamed from: e */
    public final /* synthetic */ int f13501e;

    /* renamed from: f */
    public final /* synthetic */ int f13502f;

    public C2648i(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2) {
        this.f13500d = staggeredGridLayoutManager;
        this.f13501e = i;
        this.f13502f = i2;
    }

    public final void run() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f13500d;
        int i = this.f13501e;
        int i2 = this.f13502f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$3$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$3$1$call$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
