package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import b90.C92211a;
import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.a */
public final class C94432a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f273023d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94432a(int i) {
        super(0);
        this.f273023d = i;
    }

    public Object invoke() {
        C92211a.f263929a.mo126173a(FirebaseAnalytics.C113379b.LEVEL, this.f273023d);
        return C13598b0.f38549a;
    }
}
