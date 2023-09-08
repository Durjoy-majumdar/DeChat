package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import di3.C86312j;
import fy3.C32224a;
import gc1.C87177b;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b1 */
public final class C82210b1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f241084d;

    /* renamed from: e */
    public final /* synthetic */ Activity f241085e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82210b1(int i, Activity activity) {
        super(0);
        this.f241084d = i;
        this.f241085e = activity;
    }

    public Object invoke() {
        int i = this.f241084d;
        Activity activity = this.f241085e;
        ((C87177b) C86312j.m106911c(C87177b.class)).mo121616Mc(-1, i, 6, activity, (Fragment) null, new C83130y0(), C29551z0.f80468d, new C82017a1(activity));
        return C13598b0.f38549a;
    }
}
