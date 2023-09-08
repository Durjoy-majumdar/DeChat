package com.tencent.p014mm.plugin.finder.view;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.n3 */
public final class C4121n3 extends C87413o implements C32224a<C18791w> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaLayout f18294d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4121n3(FinderMediaLayout finderMediaLayout) {
        super(0);
        this.f18294d = finderMediaLayout;
    }

    public Object invoke() {
        return new C18791w(this.f18294d.getContext(), this.f18294d, new Handler(Looper.getMainLooper()));
    }
}
