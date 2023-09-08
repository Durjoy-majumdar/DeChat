package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.m */
public final class C2807m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55776r f14037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2807m(C55776r rVar) {
        super(0);
        this.f14037d = rVar;
    }

    public Object invoke() {
        C39622i0 a = C39818r.f106831a.mo62444c(this.f14037d.f158806g).mo75002a(FinderHomeUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…inderHomeUIC::class.java)");
        C61926c.m72666K(500, new C2805l(((FinderHomeUIC) a).getActiveFragment()));
        return C13598b0.f38549a;
    }
}
