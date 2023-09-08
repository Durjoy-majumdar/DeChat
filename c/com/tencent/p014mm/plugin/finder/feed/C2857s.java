package com.tencent.p014mm.plugin.finder.feed;

import cm1.C0747l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import kf1.C9673c9;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.s */
public final class C2857s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0747l f14182d;

    /* renamed from: e */
    public final /* synthetic */ FinderSelectContract$SelectPresenter f14183e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f14184f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2857s(C0747l lVar, FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter, C8478d0 d0Var) {
        super(0);
        this.f14182d = lVar;
        this.f14183e = finderSelectContract$SelectPresenter;
        this.f14184f = d0Var;
    }

    public Object invoke() {
        WxRecyclerAdapter<C0747l> wxRecyclerAdapter;
        Log.m105924i("Finder.SelectPresenter", "activity profile tab update count: " + this.f14182d.f1765d.f146009h);
        C9673c9 c9Var = this.f14183e.f13223i;
        if (!(c9Var == null || (wxRecyclerAdapter = c9Var.f30059r) == null)) {
            wxRecyclerAdapter.notifyItemChanged(this.f14184f.f27483d);
        }
        return C13598b0.f38549a;
    }
}
