package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.view.d2 */
public final class C4034d2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveNoticeView f18107d;

    /* renamed from: e */
    public final /* synthetic */ C49352ez f18108e;

    /* renamed from: f */
    public final /* synthetic */ String f18109f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4034d2(FinderFeedLiveNoticeView finderFeedLiveNoticeView, C49352ez ezVar, String str) {
        super(0);
        this.f18107d = finderFeedLiveNoticeView;
        this.f18108e = ezVar;
        this.f18109f = str;
    }

    public Object invoke() {
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        Context context = this.f18107d.getContext();
        C87412m.m108593f(context, "context");
        C60606n.C60607a.m70859c((C60606n) c, context, this.f18108e, (C49712hj1) null, this.f18109f, "1", 4, (Object) null);
        return C13598b0.f38549a;
    }
}
