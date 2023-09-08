package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.o3 */
public final class C4138o3 extends C87413o implements C32224a<FinderVideoBanner> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaLayout f18360d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4138o3(FinderMediaLayout finderMediaLayout) {
        super(0);
        this.f18360d = finderMediaLayout;
    }

    public Object invoke() {
        if (this.f18360d.getMediaType() != C4189u7.VIDEO) {
            this.f18360d.getMediaType();
        }
        Context context = this.f18360d.getContext();
        C87412m.m108593f(context, "context");
        return new FinderVideoBanner(context);
    }
}
