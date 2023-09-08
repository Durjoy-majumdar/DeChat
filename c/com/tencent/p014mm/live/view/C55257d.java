package com.tencent.p014mm.live.view;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.live.view.d */
public final class C55257d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorPluginLayout f157370d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55257d(LiveVisitorPluginLayout liveVisitorPluginLayout) {
        super(0);
        this.f157370d = liveVisitorPluginLayout;
    }

    public Object invoke() {
        C58124b.C7172a.m7372a(this.f157370d, C58124b.C58125b.LIVE_STATUS_VISITOR_KICKED, (Bundle) null, 2, (Object) null);
        return C13598b0.f38549a;
    }
}
