package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import di3.C86312j;
import fy3.C32224a;
import gc1.C87177b;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v0 */
public final class C83048v0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f242773d;

    /* renamed from: e */
    public final /* synthetic */ Activity f242774e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83048v0(int i, Activity activity) {
        super(0);
        this.f242773d = i;
        this.f242774e = activity;
    }

    public Object invoke() {
        int i = this.f242773d;
        Activity activity = this.f242774e;
        ((C87177b) C86312j.m106911c(C87177b.class)).mo121616Mc(-1, i, 6, activity, (Fragment) null, new C82927s0(), C29542t0.f80440d, new C83040u0(activity));
        return C13598b0.f38549a;
    }
}
